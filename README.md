# SpringBootApp_v1
This project consists of how to handle requests coming to the system and direct them to appropriate services using SpringBoot. 
It consists of following request operations GET, POST, PUT and DELETE.

How to execute the application.
> Run main method in AppStarterApi class.
> Then send request through browser or Postman.

        > To get all data user this url -: localhost:8080/topics
        > To get specific data by sending id user this url-: localhost:8080/topics/{id}
            Here you should define id . eg. 1, 2...
        > To add new data user this url -: localhost:8080/topics.
			Here you should send method body including Topics data as follows.
				{
					"id": "4",
					 "name": "Avacado",
						"description": "Fruit"
				}
      > To update data, use this url -: localhost:8080/topics/{id}
			 Here you should define id . eg. 1, 2... and
			 you should send method body including Topics data as follows.
				{
						"id": "1",
						"name": "Bean",
						"description": "Vegitables"
				}
						

  > To delete data, use this url -: localhost:8080/topics/{id}
					Here you should define id . eg. 1, 2...
 
