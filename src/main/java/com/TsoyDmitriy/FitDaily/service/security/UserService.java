package com.TsoyDmitriy.FitDaily.service.security;

import com.TsoyDmitriy.FitDaily.domain.security.User;
import com.TsoyDmitriy.FitDaily.repository.security.UserRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь " + username + " не найден!"));
    }

    public static User currentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static Long currentUserId(){
        return currentUser().getId();
    }

    public static boolean hasAuthority(String authority) {
        return currentUser().getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(s -> s.equals(authority));
    }

    public static boolean isAdmin() {
        return hasAuthority("ROLE_ADMIN");
    }

    public static boolean isTrainer() {
        return hasAuthority("ROLE_TRAINER");
    }

    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу пользователь не найден"));
    }

    public List<User> findAll() {
        if(userRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке пользователей пусто");
        }
        return userRepo.findAll();
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
        if(userRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись о пользователе");
        }
    }
}
