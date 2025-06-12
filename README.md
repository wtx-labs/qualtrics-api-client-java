# Qualtrics API Client

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)

A lightweight Java client library for Qualtrics API integration. Built for Java developers who need to integrate their applications with the Qualtrics Employee Experience platform. 🚀

This API client provides type-safe Java interfaces for Qualtrics API, enabling seamless management of:
- Participant directories
- EX projects
- Project invitations
- Employee experience operations

## ✨ Why Choose This Client?

- 💡 **Type-Safe Java API** - fully typed interfaces for Qualtrics API endpoints
- 🛡️ **Secure Authentication** - API token and OAuth2 support
- 📚 **Clear Documentation** - comprehensive examples for Java integration
- 🚀 **Java 17+ Support** - compatibility with latest Java versions

## 🎯 Implemented Features

### Employee Experience (EX) API Features

- ✅ Directories API
  - List all directories
  - Create a new directory
  - Get a specific directory
  - Update a directory
  - Delete a directory

- ✅ Projects API
  - List all projects
  - Create a new project
  - Get a specific project
  - Update a project
  - Delete a project
  - Manage project participants

- ✅ Invitations API
  - Send project invitations
  - Manage invitation status
  - Retrieve invitation history

## 🚨 Project Status

> ⚠️ **Note: This is a development version!**
> 
> We are actively implementing more Qualtrics API features.
> Contributions and feedback are welcome on GitHub!

## 📦 Version Information

- **Current Version**: `0.1.0`
- **Supported API Version**: `v3`
- **Java Compatibility**: Java 17+

## 🔓 License

**MIT License**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files, to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software.

The only requirement is to preserve the original author attribution in the source code and documentation.

## 🚀 Quick Start Guide

### 1️⃣ Installation

Clone and build the library from source:

```sh
git clone https://github.com/wtx-labs/qualtrics-api-client-java.git
cd qualtrics-api-client-java
mvn clean install
```

Then add the locally built artifact to your project:

```xml
<dependency>
    <groupId>pl.wtx.qualtrics</groupId>
    <artifactId>qualtrics-api-client</artifactId>
    <version>0.1.0</version>
</dependency>
```

### 2️⃣ Java Integration Example

Here's how to get EX directory participant data using the client:

```java
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

        DirectoriesApi directoriesApi = new DirectoriesApi(apiClient);

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
```

## 🔗 Get Involved

- ✨ Check our [GitHub Issues](https://github.com/wtx-labs/qualtrics-api-client-java/issues) for latest updates
- 💡 Have suggestions? Open an Issue or contribute to the project
- 🌟 Star this repository if you find it helpful!

## 📊 Project Statistics

- ⭐ Actively developed
- 🔄 Regular updates and improvements
- 👥 Open for community contributions

## 🔍 Keywords

qualtrics java client, qualtrics ex api java, java qualtrics integration, qualtrics api v3 java, employee experience java integration, qualtrics java library, java rest api client qualtrics

🚀 Happy coding! 😊

**Your WTX Labs Team** 🚀 