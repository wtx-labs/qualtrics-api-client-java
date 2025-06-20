/*
 * Qualtrics API
 * This is the API specification for Qualtrics platform.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.qualtrics.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import pl.wtx.qualtrics.api.client.model.Meta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.wtx.qualtrics.api.client.invoker.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class PartialFailureResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nonnull
  private Meta meta;

  public static final String SERIALIZED_NAME_FAILED_ROWS = "failed_rows";
  @SerializedName(SERIALIZED_NAME_FAILED_ROWS)
  @javax.annotation.Nullable
  private List<Map<String, Object>> failedRows = new ArrayList<>();

  public PartialFailureResponse() {
  }

  public PartialFailureResponse meta(@javax.annotation.Nonnull Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nonnull Meta meta) {
    this.meta = meta;
  }


  public PartialFailureResponse failedRows(@javax.annotation.Nullable List<Map<String, Object>> failedRows) {
    this.failedRows = failedRows;
    return this;
  }

  public PartialFailureResponse addFailedRowsItem(Map<String, Object> failedRowsItem) {
    if (this.failedRows == null) {
      this.failedRows = new ArrayList<>();
    }
    this.failedRows.add(failedRowsItem);
    return this;
  }

  /**
   * Get failedRows
   * @return failedRows
   */
  @javax.annotation.Nullable
  public List<Map<String, Object>> getFailedRows() {
    return failedRows;
  }

  public void setFailedRows(@javax.annotation.Nullable List<Map<String, Object>> failedRows) {
    this.failedRows = failedRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialFailureResponse partialFailureResponse = (PartialFailureResponse) o;
    return Objects.equals(this.meta, partialFailureResponse.meta) &&
        Objects.equals(this.failedRows, partialFailureResponse.failedRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, failedRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialFailureResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    failedRows: ").append(toIndentedString(failedRows)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("meta");
    openapiFields.add("failed_rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PartialFailureResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartialFailureResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartialFailureResponse is not found in the empty JSON string", PartialFailureResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartialFailureResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartialFailureResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartialFailureResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      Meta.validateJsonElement(jsonObj.get("meta"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("failed_rows") != null && !jsonObj.get("failed_rows").isJsonNull() && !jsonObj.get("failed_rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed_rows` to be an array in the JSON string but got `%s`", jsonObj.get("failed_rows").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartialFailureResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartialFailureResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartialFailureResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartialFailureResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PartialFailureResponse>() {
           @Override
           public void write(JsonWriter out, PartialFailureResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartialFailureResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PartialFailureResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartialFailureResponse
   * @throws IOException if the JSON string is invalid with respect to PartialFailureResponse
   */
  public static PartialFailureResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartialFailureResponse.class);
  }

  /**
   * Convert an instance of PartialFailureResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

