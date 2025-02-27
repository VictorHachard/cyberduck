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
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Request item model for granting user to the room
 */
@Schema(description = "Request item model for granting user to the room")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class RoomUsersAddBatchRequestItem {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  public RoomUsersAddBatchRequestItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the user
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier for the user")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomUsersAddBatchRequestItem permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(required = true, description = "")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUsersAddBatchRequestItem roomUsersAddBatchRequestItem = (RoomUsersAddBatchRequestItem) o;
    return Objects.equals(this.id, roomUsersAddBatchRequestItem.id) &&
        Objects.equals(this.permissions, roomUsersAddBatchRequestItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUsersAddBatchRequestItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
