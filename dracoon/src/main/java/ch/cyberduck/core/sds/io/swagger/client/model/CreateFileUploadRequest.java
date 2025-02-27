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
import ch.cyberduck.core.sds.io.swagger.client.model.ObjectExpiration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * Request model for creating an upload channel
 */
@Schema(description = "Request model for creating an upload channel")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class CreateFileUploadRequest {
  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    (default: classification from parent room)
   */
  public enum ClassificationEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    ClassificationEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClassificationEnum fromValue(Integer text) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("classification")
  private ClassificationEnum classification = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("directS3Upload")
  private Boolean directS3Upload = false;

  @JsonProperty("timestampCreation")
  private DateTime timestampCreation = null;

  @JsonProperty("timestampModification")
  private DateTime timestampModification = null;

  public CreateFileUploadRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent node ID (room or folder)
   * @return parentId
  **/
  @Schema(required = true, description = "Parent node ID (room or folder)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public CreateFileUploadRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File name
   * @return name
  **/
  @Schema(required = true, description = "File name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFileUploadRequest classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    (default: classification from parent room)
   * @return classification
  **/
  @Schema(description = "Classification ID:  * `1` - public  * `2` - internal  * `3` - confidential  * `4` - strictly confidential    (default: classification from parent room)")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public CreateFileUploadRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size in byte
   * @return size
  **/
  @Schema(description = "File size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public CreateFileUploadRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public CreateFileUploadRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes  Use empty string to remove.
   * @return notes
  **/
  @Schema(description = "User notes  Use empty string to remove.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CreateFileUploadRequest directS3Upload(Boolean directS3Upload) {
    this.directS3Upload = directS3Upload;
    return this;
  }

   /**
   * &amp;#128640; Since v4.15.0  Upload direct to S3
   * @return directS3Upload
  **/
  @Schema(description = "&#128640; Since v4.15.0  Upload direct to S3")
  public Boolean isDirectS3Upload() {
    return directS3Upload;
  }

  public void setDirectS3Upload(Boolean directS3Upload) {
    this.directS3Upload = directS3Upload;
  }

  public CreateFileUploadRequest timestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)
   * @return timestampCreation
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampCreation() {
    return timestampCreation;
  }

  public void setTimestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
  }

  public CreateFileUploadRequest timestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)
   * @return timestampModification
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampModification() {
    return timestampModification;
  }

  public void setTimestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadRequest createFileUploadRequest = (CreateFileUploadRequest) o;
    return Objects.equals(this.parentId, createFileUploadRequest.parentId) &&
        Objects.equals(this.name, createFileUploadRequest.name) &&
        Objects.equals(this.classification, createFileUploadRequest.classification) &&
        Objects.equals(this.size, createFileUploadRequest.size) &&
        Objects.equals(this.expiration, createFileUploadRequest.expiration) &&
        Objects.equals(this.notes, createFileUploadRequest.notes) &&
        Objects.equals(this.directS3Upload, createFileUploadRequest.directS3Upload) &&
        Objects.equals(this.timestampCreation, createFileUploadRequest.timestampCreation) &&
        Objects.equals(this.timestampModification, createFileUploadRequest.timestampModification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, classification, size, expiration, notes, directS3Upload, timestampCreation, timestampModification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadRequest {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    directS3Upload: ").append(toIndentedString(directS3Upload)).append("\n");
    sb.append("    timestampCreation: ").append(toIndentedString(timestampCreation)).append("\n");
    sb.append("    timestampModification: ").append(toIndentedString(timestampModification)).append("\n");
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
