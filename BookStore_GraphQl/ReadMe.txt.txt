GraphiQL UI url-->(http://localhost:8080/graphiql?path=/graphql)  This is a swagger like tool here we can query to get/create data in data base 

GraphiQL (GraphQL + UI) ek browser-based tool hai jahan tu:

GraphQL queries likh sakta hai

Results dekh sakta hai (real-time)

Schema explore kar sakta hai

Query autocomplete milta hai (just like IntelliSense)

###########################################################################################################################################################################################

we need to write query on graphiql ui to get and create data in to database like below.

{
  allBooks {
    id
    title
    author
  }
}

for Post Request to create record in db
mutation {
  addBook(title: "Power Of Now", author: "Eckhart") {
    id
    title
    author
  }
}
