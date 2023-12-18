# PanoraSDK Services
A list of all services and services methods.
- Services

    - [Main](#main)

    - [Auth](#auth)

    - [Connections](#connections)

    - [Webhook](#webhook)

    - [LinkedUsers](#linkedusers)

    - [Organisations](#organisations)

    - [Projects](#projects)

    - [FieldMapping](#fieldmapping)

    - [Events](#events)

    - [MagicLink](#magiclink)

    - [Passthrough](#passthrough)

    - [CrmContact](#crmcontact)
- [All Methods](#all-methods)


## Main

| Method    | Description|
| :-------- | :----------| 
| [appControllerGetHello](#appcontrollergethello) |  |


## Auth

| Method    | Description|
| :-------- | :----------| 
| [signUp](#signup) | Register |
| [signIn](#signin) | Log In |
| [getUsers](#getusers) | Get users |
| [getApiKeys](#getapikeys) | Retrieve API Keys |
| [generateApiKey](#generateapikey) | Create API Key |


## Connections

| Method    | Description|
| :-------- | :----------| 
| [handleOAuthCallback](#handleoauthcallback) | Capture oAuth Callback |
| [getConnections](#getconnections) | List Connections |


## Webhook

| Method    | Description|
| :-------- | :----------| 
| [createWebhookMetadata](#createwebhookmetadata) | Add webhook metadata |
| [getWebhooksMetadata](#getwebhooksmetadata) | Retrieve webhooks metadata  |
| [updateWebhookStatus](#updatewebhookstatus) | Update webhook status |


## LinkedUsers

| Method    | Description|
| :-------- | :----------| 
| [addLinkedUser](#addlinkeduser) | Add Linked User |
| [getLinkedUsers](#getlinkedusers) | Retrieve Linked Users |
| [getLinkedUser](#getlinkeduser) | Retrieve a Linked User |


## Organisations

| Method    | Description|
| :-------- | :----------| 
| [getOrganisations](#getorganisations) | Retrieve Organisations |
| [createOrganisation](#createorganisation) | Create an Organisation |


## Projects

| Method    | Description|
| :-------- | :----------| 
| [getProjects](#getprojects) | Retrieve projects |
| [createProject](#createproject) | Create a project |


## FieldMapping

| Method    | Description|
| :-------- | :----------| 
| [getFieldMappingsEntities](#getfieldmappingsentities) | Retrieve field mapping entities |
| [getFieldMappings](#getfieldmappings) | Retrieve field mappings |
| [getFieldMappingValues](#getfieldmappingvalues) | Retrieve field mappings values |
| [defineTargetField](#definetargetfield) | Define target Field |
| [mapField](#mapfield) | Map Custom Field |
| [getCustomProviderProperties](#getcustomproviderproperties) | Retrieve Custom Properties |


## Events

| Method    | Description|
| :-------- | :----------| 
| [getEvents](#getevents) | Retrieve Events |


## MagicLink

| Method    | Description|
| :-------- | :----------| 
| [createMagicLink](#createmagiclink) | Create a Magic Link |
| [getMagicLinks](#getmagiclinks) | Retrieve Magic Links |
| [getMagicLink](#getmagiclink) | Retrieve a Magic Link |


## Passthrough

| Method    | Description|
| :-------- | :----------| 
| [passthroughRequest](#passthroughrequest) | Make a passthrough request |


## CrmContact

| Method    | Description|
| :-------- | :----------| 
| [addContact](#addcontact) | Create CRM Contact |
| [getContacts](#getcontacts) | List a batch of CRM Contacts |
| [updateContact](#updatecontact) | Update a CRM Contact |
| [getContact](#getcontact) | Retrieve a CRM Contact |
| [addContacts](#addcontacts) | Add a batch of CRM Contacts |


## All Methods


### **appControllerGetHello**

- HTTP Method: GET
- Endpoint: /


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.mainService.appControllerGetHello();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **signUp**
Register
- HTTP Method: POST
- Endpoint: /auth/register


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.authService.signUp();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **signIn**
Log In
- HTTP Method: POST
- Endpoint: /auth/login


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.authService.signIn();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getUsers**
Get users
- HTTP Method: GET
- Endpoint: /auth/users


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.authService.getUsers();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getApiKeys**
Retrieve API Keys
- HTTP Method: GET
- Endpoint: /auth/api-keys


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.authService.getApiKeys();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **generateApiKey**
Create API Key
- HTTP Method: POST
- Endpoint: /auth/generate-apikey


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.authService.generateApiKey();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **handleOAuthCallback**
Capture oAuth Callback
- HTTP Method: GET
- Endpoint: /connections/oauth/callback


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| state | String | Required |  |
| code | String | Required |  |
| location | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.connectionsService.handleOAuthCallback(
        "stateSampleValue",
        "codeSampleValue",
        "locationSampleValue"
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getConnections**
List Connections
- HTTP Method: GET
- Endpoint: /connections


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.connectionsService.getConnections();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **createWebhookMetadata**
Add webhook metadata
- HTTP Method: POST
- Endpoint: /webhook


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.webhookService.createWebhookMetadata();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getWebhooksMetadata**
Retrieve webhooks metadata 
- HTTP Method: GET
- Endpoint: /webhook


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.webhookService.getWebhooksMetadata();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **updateWebhookStatus**
Update webhook status
- HTTP Method: PUT
- Endpoint: /webhook/{id}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| id | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.webhookService.updateWebhookStatus("idSampleValue");
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **addLinkedUser**
Add Linked User
- HTTP Method: POST
- Endpoint: /linked-users/create


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.linkedUsersService.addLinkedUser();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getLinkedUsers**
Retrieve Linked Users
- HTTP Method: GET
- Endpoint: /linked-users


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.linkedUsersService.getLinkedUsers();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getLinkedUser**
Retrieve a Linked User
- HTTP Method: GET
- Endpoint: /linked-users/single


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| id | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.linkedUsersService.getLinkedUser("idSampleValue");
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **getOrganisations**
Retrieve Organisations
- HTTP Method: GET
- Endpoint: /organisations


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.organisationsService.getOrganisations();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **createOrganisation**
Create an Organisation
- HTTP Method: POST
- Endpoint: /organisations/create


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.organisationsService.createOrganisation();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **getProjects**
Retrieve projects
- HTTP Method: GET
- Endpoint: /projects


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.projectsService.getProjects();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **createProject**
Create a project
- HTTP Method: POST
- Endpoint: /projects/create


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.projectsService.createProject();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **getFieldMappingsEntities**
Retrieve field mapping entities
- HTTP Method: GET
- Endpoint: /field-mapping/entities


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.getFieldMappingsEntities();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getFieldMappings**
Retrieve field mappings
- HTTP Method: GET
- Endpoint: /field-mapping/attribute


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.getFieldMappings();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getFieldMappingValues**
Retrieve field mappings values
- HTTP Method: GET
- Endpoint: /field-mapping/value


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.getFieldMappingValues();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **defineTargetField**
Define target Field
- HTTP Method: POST
- Endpoint: /field-mapping/define


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.defineTargetField();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **mapField**
Map Custom Field
- HTTP Method: POST
- Endpoint: /field-mapping/map


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.mapField();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getCustomProviderProperties**
Retrieve Custom Properties
- HTTP Method: GET
- Endpoint: /field-mapping/properties


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| linkedUserId | String | Required |  |
| providerId | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.fieldMappingService.getCustomProviderProperties(
        "linkedUserIdSampleValue",
        "providerIdSampleValue"
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **getEvents**
Retrieve Events
- HTTP Method: GET
- Endpoint: /events


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.eventsService.getEvents();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **createMagicLink**
Create a Magic Link
- HTTP Method: POST
- Endpoint: /magic-link/create


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.magicLinkService.createMagicLink();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getMagicLinks**
Retrieve Magic Links
- HTTP Method: GET
- Endpoint: /magic-link


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.magicLinkService.getMagicLinks();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getMagicLink**
Retrieve a Magic Link
- HTTP Method: GET
- Endpoint: /magic-link/single


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| id | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.magicLinkService.getMagicLink("idSampleValue");
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **passthroughRequest**
Make a passthrough request
- HTTP Method: POST
- Endpoint: /passthrough


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| integrationId | String | Required |  |
| linkedUserId | String | Required |  |
| input | Object | Required | Request body. |

**Return Type**

[PassThroughResponse](/src/main/java/io/panorasdk/models/README.md#passthroughresponse) 

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.passthroughService.passthroughRequest(
        "integrationIdSampleValue",
        "linkedUserIdSampleValue"
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **addContact**
Create CRM Contact
- HTTP Method: POST
- Endpoint: /crm/contact


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| integrationId | String | Required |  |
| linkedUserId | String | Required |  |
| remoteData | Boolean | Optional |  |
| input | Object | Required | Request body. |

**Return Type**

[AddContactResponse](/src/main/java/io/panorasdk/models/README.md#addcontactresponse) 

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.crmContactService.addContact(
        "integrationIdSampleValue",
        "linkedUserIdSampleValue",
        true
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getContacts**
List a batch of CRM Contacts
- HTTP Method: GET
- Endpoint: /crm/contact


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| integrationId | String | Required |  |
| linkedUserId | String | Required |  |
| remoteData | Boolean | Optional |  |

**Return Type**

[GetContactsResponse](/src/main/java/io/panorasdk/models/README.md#getcontactsresponse) 

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.crmContactService.getContacts(
        "integrationIdSampleValue",
        "linkedUserIdSampleValue",
        true
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **updateContact**
Update a CRM Contact
- HTTP Method: PATCH
- Endpoint: /crm/contact


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| id | String | Required |  |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.crmContactService.updateContact("idSampleValue");
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getContact**
Retrieve a CRM Contact
- HTTP Method: GET
- Endpoint: /crm/contact/{id}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| id | String | Required |  |
| remoteData | Boolean | Optional |  |

**Return Type**

[GetContactResponse](/src/main/java/io/panorasdk/models/README.md#getcontactresponse) 

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.crmContactService.getContact("idSampleValue", true);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **addContacts**
Add a batch of CRM Contacts
- HTTP Method: POST
- Endpoint: /crm/contact/batch


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| integrationId | String | Required |  |
| linkedUserId | String | Required |  |
| remoteData | Boolean | Optional |  |
| input | Object | Required | Request body. |

**Return Type**

[AddContactsResponse](/src/main/java/io/panorasdk/models/README.md#addcontactsresponse) 

**Example Usage Code Snippet**
```Java
package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.crmContactService.addContacts(
        "integrationIdSampleValue",
        "linkedUserIdSampleValue",
        true
      );
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



