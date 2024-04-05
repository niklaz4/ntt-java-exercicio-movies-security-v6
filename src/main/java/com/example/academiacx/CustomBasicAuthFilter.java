package com.example.academiacx;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.naming.AuthenticationException;
import java.io.IOException;

public class CustomBasicAuthFilter extends AbstractAuthenticationProcessingFilter {
    public CustomBasicAuthFilter(AuthenticationManager authenticationManager) {
        super(new AntPathRequestMatcher("/login", "POST"));
        setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       String authorizationHeader = request.getHeader("Authorization");
       if(authorizationHeader != null && authorizationHeader.startsWith("Basic")){
          String base64Credentials = authorizationHeader.substring("Basic ".length());
          String[] credentials = new String[0];
          String username = credentials[0];
          String password = credentials[1];

           UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
           return getAuthenticationManager().authenticate(authRequest);
       }
       return null;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException{
        SecurityContextHolder.clearContext();
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "CREDENCIAIS INVALIDAS");
    }
}
