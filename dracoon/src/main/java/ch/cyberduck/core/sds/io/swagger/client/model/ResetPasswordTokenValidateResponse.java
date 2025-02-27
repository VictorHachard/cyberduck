/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.LoginPasswordPolicies;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Password reset information
 */
@Schema(description = "Password reset information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class ResetPasswordTokenValidateResponse {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("loginPasswordPolicies")
  private LoginPasswordPolicies loginPasswordPolicies = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("gender")
  private String gender = "n";

  @JsonProperty("allowSystemGlobalWeakPassword")
  private Boolean allowSystemGlobalWeakPassword = null;

  public ResetPasswordTokenValidateResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * User first name
   * @return firstName
  **/
  @Schema(required = true, description = "User first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ResetPasswordTokenValidateResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User last name
   * @return lastName
  **/
  @Schema(required = true, description = "User last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ResetPasswordTokenValidateResponse loginPasswordPolicies(LoginPasswordPolicies loginPasswordPolicies) {
    this.loginPasswordPolicies = loginPasswordPolicies;
    return this;
  }

   /**
   * Get loginPasswordPolicies
   * @return loginPasswordPolicies
  **/
  @Schema(description = "")
  public LoginPasswordPolicies getLoginPasswordPolicies() {
    return loginPasswordPolicies;
  }

  public void setLoginPasswordPolicies(LoginPasswordPolicies loginPasswordPolicies) {
    this.loginPasswordPolicies = loginPasswordPolicies;
  }

  public ResetPasswordTokenValidateResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.18.0  Job title
   * @return title
  **/
  @Schema(description = "&#128679; Deprecated since v4.18.0  Job title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResetPasswordTokenValidateResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.12.0  Gender
   * @return gender
  **/
  @Schema(description = "&#128679; Deprecated since v4.12.0  Gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ResetPasswordTokenValidateResponse allowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.14.0  Allow weak password  Please use &#x60;loginPasswordPolicies&#x60; instead
   * @return allowSystemGlobalWeakPassword
  **/
  @Schema(description = "&#128679; Deprecated since v4.14.0  Allow weak password  Please use `loginPasswordPolicies` instead")
  public Boolean isAllowSystemGlobalWeakPassword() {
    return allowSystemGlobalWeakPassword;
  }

  public void setAllowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordTokenValidateResponse resetPasswordTokenValidateResponse = (ResetPasswordTokenValidateResponse) o;
    return Objects.equals(this.firstName, resetPasswordTokenValidateResponse.firstName) &&
        Objects.equals(this.lastName, resetPasswordTokenValidateResponse.lastName) &&
        Objects.equals(this.loginPasswordPolicies, resetPasswordTokenValidateResponse.loginPasswordPolicies) &&
        Objects.equals(this.title, resetPasswordTokenValidateResponse.title) &&
        Objects.equals(this.gender, resetPasswordTokenValidateResponse.gender) &&
        Objects.equals(this.allowSystemGlobalWeakPassword, resetPasswordTokenValidateResponse.allowSystemGlobalWeakPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, loginPasswordPolicies, title, gender, allowSystemGlobalWeakPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordTokenValidateResponse {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginPasswordPolicies: ").append(toIndentedString(loginPasswordPolicies)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    allowSystemGlobalWeakPassword: ").append(toIndentedString(allowSystemGlobalWeakPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
