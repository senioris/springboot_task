package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.InvalidParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BadRequestError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-08T11:34:01.383312031Z[Etc/UTC]")
public class BadRequestError {

  private String title = "Bad Request";

  private String detail = "Bad request parameters.";

  @Valid
  private List<@Valid InvalidParam> invalidParams = new ArrayList<>();

  public BadRequestError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BadRequestError(String title, String detail, List<@Valid InvalidParam> invalidParams) {
    this.title = title;
    this.detail = detail;
    this.invalidParams = invalidParams;
  }

  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BadRequestError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @NotNull 
  @Schema(name = "detail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public BadRequestError invalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestError addInvalidParamsItem(InvalidParam invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

  /**
   * Get invalidParams
   * @return invalidParams
  */
  @NotNull @Valid 
  @Schema(name = "invalid-params", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invalid-params")
  public List<@Valid InvalidParam> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(this.title, badRequestError.title) &&
        Objects.equals(this.detail, badRequestError.detail) &&
        Objects.equals(this.invalidParams, badRequestError.invalidParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, invalidParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestError {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

