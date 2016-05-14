# ReadMe
This is a Demo which based on Dubbo.It consists of 3 parts:<br/>
**1.Dubbo-Demo-Interface:**This is a service interface jar for Decoupling.<br/>
**2.Dubbo-Demo:**This is the service implements.<br/>
**3.Consumer:**This is the service consumer,which calls Dubbo-Demo. <br/>
<br/>
The Consumer calls Dubbo-Demo through Dubbo, which use multicast protocol,to get back a string.And then print that String on the console.

