# Problem-Solving-DijkstraShortestPath

This Service is created for creating a Microservoce (using latest tech stack), which will fetch the Vertex and Edges from MongoDB and provide the shortest path between the vertexes. This service can be used as a microservice and can be deployed easily.

Request format:
{
  "startVertex": "vertexA",
  "destinationVertex" : "vertexB"
}

vertexA and vertexB are the vertexes' unique key or name.

The output format will be :

vertexA->vertexB->vertexC
