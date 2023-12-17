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
| [signUp](#signup) |  |
| [signIn](#signin) |  |
| [getUsers](#getusers) |  |
| [getApiKeys](#getapikeys) |  |
| [generateApiKey](#generateapikey) |  |


## Connections

| Method    | Description|
| :-------- | :----------| 
| [handleOAuthCallback](#handleoauthcallback) |  |
| [getConnections](#getconnections) |  |


## Webhook

| Method    | Description|
| :-------- | :----------| 
| [createWebhookMetadata](#createwebhookmetadata) |  |
| [getWebhooksMetadata](#getwebhooksmetadata) |  |
| [updateWebhookStatus](#updatewebhookstatus) |  |


## LinkedUsers

| Method    | Description|
| :-------- | :----------| 
| [addLinkedUser](#addlinkeduser) |  |
| [getLinkedUsers](#getlinkedusers) |  |
| [getLinkedUser](#getlinkeduser) |  |


## Organisations

| Method    | Description|
| :-------- | :----------| 
| [getOrganisations](#getorganisations) |  |
| [createOrganisation](#createorganisation) |  |


## Projects

| Method    | Description|
| :-------- | :----------| 
| [getProjects](#getprojects) |  |
| [createProject](#createproject) |  |


## FieldMapping

| Method    | Description|
| :-------- | :----------| 
| [getFieldMappingsEntities](#getfieldmappingsentities) |  |
| [getFieldMappings](#getfieldmappings) |  |
| [getFieldMappingValues](#getfieldmappingvalues) |  |
| [defineTargetField](#definetargetfield) |  |
| [mapField](#mapfield) |  |
| [getCustomProviderProperties](#getcustomproviderproperties) |  |


## Events

| Method    | Description|
| :-------- | :----------| 
| [getEvents](#getevents) |  |


## MagicLink

| Method    | Description|
| :-------- | :----------| 
| [createMagicLink](#createmagiclink) |  |
| [getMagicLinks](#getmagiclinks) |  |
| [getMagicLink](#getmagiclink) |  |


## Passthrough

| Method    | Description|
| :-------- | :----------| 
| [passthroughRequest](#passthroughrequest) |  |


## CrmContact

| Method    | Description|
| :-------- | :----------| 
| [addContact](#addcontact) | Create CRM Contact |
| [getContacts](#getcontacts) |  |
| [updateContact](#updatecontact) |  |
| [getContact](#getcontact) | Retrive a CRM Contact |
| [addContacts](#addcontacts) |  |


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
Retrive a CRM Contact
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



