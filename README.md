# Payroll
Summary

In this project we look at tactics which will help make your services less likely to break existing clients you may or may not control:
- Don’t remove old fields. Instead, support them, by creating extra columns in the databse and not deleting old column.
- Use rel-based links so clients don’t have to hard code URIs.
- Retain old links as long as possible. Even if you have to change the URI, keep the reels so older clients have a path onto the newer features.
- Use links, not payload data, to instruct clients when various state-driving operations are available.
It may appear to be a bit of effort to build up RepresentationModelAssembler implementations for each resource type and to use these components in all of your controllers. 
But this extra bit of server-side setup (made easy thanks to Spring HATEOAS) can ensure the clients you control (and more importantly, those you don’t) can upgrade with 
ease as you evolve your API.
