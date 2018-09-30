Images of following CRC cards are checkedin
1. Table.jpg - This class acts as subject of observer pattern
2. TableAvailable.jpg - This class represents available state of a table
3. TableOccupied.jpg - This class represents occupied state of a table
4. ConciergeStaff.jpg - This is an observer of table that manages waitlist
5. Waiter.jpg - This class is an observer of table who get next customer to the table and services them
6. Messenger.jpg - This class is responsible for all customer notifications
7. Customer.jpg - This class represents customer of the restaurant
8. Collaboration Diagram.jpg - This is the collaboration diagram


Design patterns used:

1. State pattern for Table 
State of table triggers the customer wait-list management (like notifying customers, checking in next customer, etc) and hence its important to maintain it.

2. Observer pattern:
Once table state changes (Subject), it needs to notify its observers (ConciergeStaff and Waiter) to do some action. ConciergeStaff determines next eligible customer based on table size and customer party size and triggers notification where as waiter goes to the entrance to escort the next customer to the table.
