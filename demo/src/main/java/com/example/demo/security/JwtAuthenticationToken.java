//package com.example.demo.security;
//
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.util.Collection;
//
//public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
//
//    public JwtAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
//        super(principal, credentials, authorities);
//    }
//
//    public JwtAuthenticationToken(Authentication authentication) {
//        super(authentication.getPrincipal(), authentication.getCredentials(), authentication.getAuthorities());
//    }
//}
//
