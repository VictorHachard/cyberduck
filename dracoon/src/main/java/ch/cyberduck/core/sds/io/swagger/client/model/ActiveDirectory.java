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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Active Directory information
 */
@Schema(description = "Active Directory information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class ActiveDirectory {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("isGlobalAvailable")
  private Boolean isGlobalAvailable = null;

  public ActiveDirectory id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @Schema(required = true, description = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ActiveDirectory alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Unique name for an Active Directory configuration
   * @return alias
  **/
  @Schema(required = true, description = "Unique name for an Active Directory configuration")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ActiveDirectory isGlobalAvailable(Boolean isGlobalAvailable) {
    this.isGlobalAvailable = isGlobalAvailable;
    return this;
  }

   /**
   * Is available for all customers
   * @return isGlobalAvailable
  **/
  @Schema(required = true, description = "Is available for all customers")
  public Boolean isIsGlobalAvailable() {
    return isGlobalAvailable;
  }

  public void setIsGlobalAvailable(Boolean isGlobalAvailable) {
    this.isGlobalAvailable = isGlobalAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectory activeDirectory = (ActiveDirectory) o;
    return Objects.equals(this.id, activeDirectory.id) &&
        Objects.equals(this.alias, activeDirectory.alias) &&
        Objects.equals(this.isGlobalAvailable, activeDirectory.isGlobalAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, isGlobalAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    isGlobalAvailable: ").append(toIndentedString(isGlobalAvailable)).append("\n");
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
