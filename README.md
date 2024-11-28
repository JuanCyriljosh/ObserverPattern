<h1>Real-time News Subscription Service</h1> 
<h2>Background</h2> 
<p>You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.</p>

 <h2>Scenario Description:</h2> 
 <p>The system comprises two main components: <strong>NewsAgency</strong> and <strong>Subscriber</strong>.</p> 
 
 <h3>NewsAgency:</h3> 
 <p>Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.</p>
 
<h3>Subscriber:</h3> 
<p>Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.</p> 

<h2>Requirements</h2> 
<h3>Subscription Management</h3> 

<ul> <li>Users should be able to subscribe to the news service.</li> 
<li>Subscribers should be notified promptly when new news is published.</li> </ul> 

<h3>Dynamic Subscription Updates</h3> 
<ul> <li>The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.</li> </ul> 

<h3>Decoupled Communication</h3> 
<ul> <li>Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.</li> </ul> 

<h2>Expected Behavior</h2> <ul> <li>When the news agency publishes breaking news, all subscribed users should receive immediate updates.</li> <li>Subscribers can join or leave the service without affecting the delivery of news to other subscribers.</li> <li>The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.</li> </ul> 

<h2>Constraints</h2> <ul> <li>The system should be scalable to handle a growing number of subscribers without compromising performance.</li> <li>Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.</li>
 
 ![Blank diagram (1)](https://github.com/user-attachments/assets/6e8062a6-5631-46fc-add6-d1b9590c82dc)
