//package com.example.demo.security;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.example.demo.service.JwtUserDetailsService;
//
//import java.io.IOException;
//
//public class JwtRequestFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtTokenUtil jwtUtil;
//
//    @Autowired
//    private JwtUserDetailsService userDetailsService;
//
//
//	@Override
//	protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request,
//			jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain)
//			throws jakarta.servlet.ServletException, IOException {
//		 final String authorizationHeader = request.getHeader("Authorization");
//	        String username = null;
//	        String jwtToken = null;
//
//	        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//	            jwtToken = authorizationHeader.substring(7);
//	            try {
//	                username = jwtUtil.getUserNameFromToken(jwtToken);
//	            } catch (Exception e) {
//	                System.out.println("Unable to get JWT Token");
//	            }
//	        }
//
//	        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//	            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//	            if (jwtUtil.validateToken(jwtToken, userDetails)) {
//	                JwtAuthenticationToken authToken = new JwtAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//	                SecurityContextHolder.getContext().setAuthentication(authToken);
//	            }
//	        }
//
//	        filterChain.doFilter(request, response);
//		
//	}
//}
//
