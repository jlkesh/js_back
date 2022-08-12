//package uz.jl.todoapp.todoapp.config.security;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @author "Elmurodov Javohir"
// * @since 12/08/22/08:50 (Friday)
// * todoapp/IntelliJ IDEA
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//public class SecurityConfigurer {
//    public static final String[] WHITE_LIST = new String[]{
//            "/h2/**",
//            "/login/**",
//            "/js/**",
//            "/css/**",
//            "/img/**"
//    };
//
//    @Value("${REMEMBER_ME_TOKEN_SECRET}")
//    public String REMEMBER_ME_TOKEN_SECRET;
//
//    @Value("${REMEMBER_ME_TOKEN_EXPIRY_IN_DAYS}")
//    public int REMEMBER_ME_TOKEN_EXPIRY_IN_DAYS = 20;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf()
//                .disable()
//                .authorizeRequests(expressionInterceptUrlRegistry ->
//                        expressionInterceptUrlRegistry
////                                .antMatchers("/admin").hasRole("ADMIN")
////                                .antMatchers("/user").hasAnyRole("ADMIN", "USER", "MANAGER")
////                                .antMatchers("/manager").hasAnyRole("ADMIN", "MANAGER")
////                                .antMatchers("/profile").authenticated()
//                                .antMatchers(WHITE_LIST).permitAll()
//                                .anyRequest()
//                                .authenticated())
//                .formLogin(httpSecurityFormLoginConfigurer ->
//                        httpSecurityFormLoginConfigurer
//                                .loginPage("/login")
//                                .loginProcessingUrl("/login")
//                                .defaultSuccessUrl("/", false))
//                .rememberMe(httpSecurityRememberMeConfigurer ->
//                        httpSecurityRememberMeConfigurer
//                                .rememberMeParameter("rememberMe")
//                                .rememberMeCookieName("remember")
//                                .key(REMEMBER_ME_TOKEN_SECRET)
//                                .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(REMEMBER_ME_TOKEN_EXPIRY_IN_DAYS)))
//                .logout(httpSecurityLogoutConfigurer ->
//                        httpSecurityLogoutConfigurer
//                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "POST", true))
//                                .logoutSuccessUrl("/login")
//                                .clearAuthentication(true)
//                                .deleteCookies("JSESSIONID", "remember")
//                                .invalidateHttpSession(true));
//
//        return http.build();
//    }
//
//}