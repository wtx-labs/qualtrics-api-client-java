package pl.wtx.qualtrics;

import pl.wtx.qualtrics.api.client.config.GsonConfig;
import pl.wtx.qualtrics.api.client.config.OkHttpClientConfig;
import pl.wtx.qualtrics.api.client.invoker.ApiClient;
import pl.wtx.qualtrics.api.client.invoker.JSON;

/**
 * Qualtrics API Client
 * @author WTX Labs
 * @see https://github.com/wtx-labs/qualtrics-api-client-java
 * @license MIT
 */
public class QualtricsApiClient extends ApiClient {

    // Default setup of the API Client to provide ignoring not recognized fields in the response.
    public QualtricsApiClient() {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("QualtricsApiClient (by wtx-labs)");
    }

    // Default configuration improved with logging API communication messages.
    public QualtricsApiClient(boolean enableLoggingApiMessages) {

        JSON.setGson(GsonConfig.createGson());
        setUserAgent("QualtricsApiClient (by wtx-labs)");

        if (enableLoggingApiMessages) {
            setHttpClient(OkHttpClientConfig.configureClient(getHttpClient()));
        }

    }

}
