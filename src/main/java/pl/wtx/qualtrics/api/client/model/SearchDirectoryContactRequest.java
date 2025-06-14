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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * SearchDirectoryContactRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SearchDirectoryContactRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  @javax.annotation.Nullable
  private Map<String, Object> filter = new HashMap<>();

  public SearchDirectoryContactRequest() {
  }

  public SearchDirectoryContactRequest filter(@javax.annotation.Nullable Map<String, Object> filter) {
    this.filter = filter;
    return this;
  }

  public SearchDirectoryContactRequest putFilterItem(String key, Object filterItem) {
    if (this.filter == null) {
      this.filter = new HashMap<>();
    }
    this.filter.put(key, filterItem);
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public Map<String, Object> getFilter() {
    return filter;
  }

  public void setFilter(@javax.annotation.Nullable Map<String, Object> filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchDirectoryContactRequest searchDirectoryContactRequest = (SearchDirectoryContactRequest) o;
    return Objects.equals(this.filter, searchDirectoryContactRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchDirectoryContactRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchDirectoryContactRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchDirectoryContactRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchDirectoryContactRequest is not found in the empty JSON string", SearchDirectoryContactRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchDirectoryContactRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchDirectoryContactRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchDirectoryContactRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchDirectoryContactRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchDirectoryContactRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchDirectoryContactRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchDirectoryContactRequest>() {
           @Override
           public void write(JsonWriter out, SearchDirectoryContactRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchDirectoryContactRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchDirectoryContactRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchDirectoryContactRequest
   * @throws IOException if the JSON string is invalid with respect to SearchDirectoryContactRequest
   */
  public static SearchDirectoryContactRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchDirectoryContactRequest.class);
  }

  /**
   * Convert an instance of SearchDirectoryContactRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

