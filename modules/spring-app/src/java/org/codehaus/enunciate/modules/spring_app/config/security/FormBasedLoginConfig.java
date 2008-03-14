package org.codehaus.enunciate.modules.spring_app.config.security;

/**
 * Configuration for a form-based login.
 *
 * @author Ryan Heaton
 */
public class FormBasedLoginConfig {

  private String url = "/form/login";
  private String redirectOnSuccessUrl = "/";
  private String redirectOnFailureUrl = "/login.jsp";
  private String loginPageURL = "login.jsp";
  private String loginPageFile;

  /**
   * The URL of the form-based login endpoint.
   *
   * @return The URL of the form-based login endpoint.
   */
  public String getUrl() {
    return url;
  }

  /**
   * The URL of the form-based login endpoint.
   *
   * @param url The URL of the form-based login endpoint.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The URL to which to redirect on login success.
   *
   * @return The URL to which to redirect on login success.
   */
  public String getRedirectOnSuccessUrl() {
    return redirectOnSuccessUrl;
  }

  /**
   * The URL to which to redirect on login success.
   *
   * @param redirectOnSuccessUrl The URL to which to redirect on login success.
   */
  public void setRedirectOnSuccessUrl(String redirectOnSuccessUrl) {
    this.redirectOnSuccessUrl = redirectOnSuccessUrl;
  }

  /**
   * The URL to which to redirect on login failure.
   *
   * @return The URL to which to redirect on login failure.
   */
  public String getRedirectOnFailureUrl() {
    return redirectOnFailureUrl;
  }

  /**
   * The URL to which to redirect on login failure.
   *
   * @param redirectOnFailureUrl The URL to which to redirect on login failure.
   */
  public void setRedirectOnFailureUrl(String redirectOnFailureUrl) {
    this.redirectOnFailureUrl = redirectOnFailureUrl;
  }

  /**
   * The URL of the login page.
   *
   * @return The URL of the login page.
   */
  public String getLoginPageURL() {
    return loginPageURL;
  }

  /**
   * The URL of the login page.
   *
   * @param loginPageURL The URL of the login page.
   */
  public void setLoginPageURL(String loginPageURL) {
    this.loginPageURL = loginPageURL;
  }

  /**
   * File to be used as the login page.
   *
   * @return File to be used as the login page.
   */
  public String getLoginPageFile() {
    return loginPageFile;
  }

  /**
   * File to be used as the login page.
   *
   * @param loginPageFile File to be used as the login page.
   */
  public void setLoginPageFile(String loginPageFile) {
    this.loginPageFile = loginPageFile;
  }
}