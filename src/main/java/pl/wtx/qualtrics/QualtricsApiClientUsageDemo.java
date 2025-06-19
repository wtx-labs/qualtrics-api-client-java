package pl.wtx.qualtrics;

import pl.wtx.qualtrics.api.client.ExApiDirectoriesApi;
import pl.wtx.qualtrics.api.client.invoker.ApiException;
import pl.wtx.qualtrics.api.client.model.ParticipantResponse;

/**
 * Qualtrics API Client - Usage Demo
 * 
 * @author WTX Labs
 * @see https://github.com/wtx-labs/qualtrics-api-client-java
 * @license MIT
 */
public class QualtricsApiClientUsageDemo {

    // TODO: Set your Qualtrics API base path!
    private static final String API_BASE_PATH = "https://yul1.qualtrics.com/API/v3";
    private static final String API_ACCESS_TOKEN = "TODO_SET_API_TOKEN";

    public static void main(String[] args) {

        System.out.println(">>> Start running the QualtricsApiClientUsageDemo...");

        // Use QualtricsApiClient(true) if you need to log API communication messages.
        QualtricsApiClient apiClient = new QualtricsApiClient();

        apiClient.setBasePath(API_BASE_PATH);
        apiClient.addDefaultHeader("X-API-TOKEN", API_ACCESS_TOKEN);

        ExApiDirectoriesApi directoriesApi = new ExApiDirectoriesApi(apiClient);

        try {

            // Example request for participant with identifier eg. P_cMiJRssmeLW0Noh from the "EX" directory.
            ParticipantResponse participantResponse = directoriesApi.getParticipantByIdInDirectory("EX", "P_cMiJRssmeLW0Noh");

            // Example participant's first name:
            System.out.println("Participant first name: " + participantResponse.getFirstName());

        } catch (ApiException exception) {
            System.err.println("Error occurred during API call: " + exception);
        }

        System.out.println("<<< The QualtricsApiClientUsageDemo has been finished.");

    }

}
