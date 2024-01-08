package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.PageDto;
import com.example.demo.model.TaskDto;
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
 * TaskListDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-08T11:34:01.383312031Z[Etc/UTC]")
public class TaskListDto {

  @Valid
  private List<@Valid TaskDto> results = new ArrayList<>();

  private PageDto page;

  public TaskListDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskListDto(List<@Valid TaskDto> results, PageDto page) {
    this.results = results;
    this.page = page;
  }

  public TaskListDto results(List<@Valid TaskDto> results) {
    this.results = results;
    return this;
  }

  public TaskListDto addResultsItem(TaskDto resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid TaskDto> getResults() {
    return results;
  }

  public void setResults(List<@Valid TaskDto> results) {
    this.results = results;
  }

  public TaskListDto page(PageDto page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  @NotNull @Valid 
  @Schema(name = "page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public PageDto getPage() {
    return page;
  }

  public void setPage(PageDto page) {
    this.page = page;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskListDto taskListDto = (TaskListDto) o;
    return Objects.equals(this.results, taskListDto.results) &&
        Objects.equals(this.page, taskListDto.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListDto {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

