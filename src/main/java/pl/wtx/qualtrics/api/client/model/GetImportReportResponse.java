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
import org.openapitools.jackson.nullable.JsonNullable;
import pl.wtx.qualtrics.api.client.model.GetImportReportResponseResults;
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
 * GetImportReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class GetImportReportResponse {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  @javax.annotation.Nonnull
  private GetImportReportResponseResults results;

  public static final String SERIALIZED_NAME_SKIP_TOKEN = "skipToken";
  @SerializedName(SERIALIZED_NAME_SKIP_TOKEN)
  @javax.annotation.Nullable
  private String skipToken;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nonnull
  private Meta meta;

  public GetImportReportResponse() {
  }

  public GetImportReportResponse results(@javax.annotation.Nonnull GetImportReportResponseResults results) {
    this.results = results;
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @javax.annotation.Nonnull
  public GetImportReportResponseResults getResults() {
    return results;
  }

  public void setResults(@javax.annotation.Nonnull GetImportReportResponseResults results) {
    this.results = results;
  }


  public GetImportReportResponse skipToken(@javax.annotation.Nullable String skipToken) {
    this.skipToken = skipToken;
    return this;
  }

  /**
   * The start position for pagination
   * @return skipToken
   */
  @javax.annotation.Nullable
  public String getSkipToken() {
    return skipToken;
  }

  public void setSkipToken(@javax.annotation.Nullable String skipToken) {
    this.skipToken = skipToken;
  }


  public GetImportReportResponse meta(@javax.annotation.Nonnull Meta meta) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImportReportResponse getImportReportResponse = (GetImportReportResponse) o;
    return Objects.equals(this.results, getImportReportResponse.results) &&
        Objects.equals(this.skipToken, getImportReportResponse.skipToken) &&
        Objects.equals(this.meta, getImportReportResponse.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, skipToken, meta);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportReportResponse {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    skipToken: ").append(toIndentedString(skipToken)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("skipToken");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("meta");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetImportReportResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetImportReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetImportReportResponse is not found in the empty JSON string", GetImportReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetImportReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetImportReportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetImportReportResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `results`
      GetImportReportResponseResults.validateJsonElement(jsonObj.get("results"));
      if ((jsonObj.get("skipToken") != null && !jsonObj.get("skipToken").isJsonNull()) && !jsonObj.get("skipToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skipToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skipToken").toString()));
      }
      // validate the required field `meta`
      Meta.validateJsonElement(jsonObj.get("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetImportReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetImportReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetImportReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetImportReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetImportReportResponse>() {
           @Override
           public void write(JsonWriter out, GetImportReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetImportReportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetImportReportResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetImportReportResponse
   * @throws IOException if the JSON string is invalid with respect to GetImportReportResponse
   */
  public static GetImportReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetImportReportResponse.class);
  }

  /**
   * Convert an instance of GetImportReportResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

