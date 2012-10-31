Spring Remoting Support with Http Invoker Client

Spring HTTP Invoker is an important solution for Java-to-Java Remoting. This technology uses the standard Java serialization mechanism to expose services through HTTP and can be thought as an alternative solution instead of the custom serialization found in Hessian and Burlap. Also, it is only provided by Spring so both client and server applications have to be based on Spring.

Spring supports HTTP invoker infrastructure via HttpInvokerProxyFactoryBean and HttpInvokerServiceExporter. HttpInvokerServiceExporter that exports the specified service bean as HTTP invoker service endpoint, accessible via an HTTP invoker proxy. HttpInvokerProxyFactoryBean is a factory bean for HTTP invoker proxies.

This project shows how to develop Http Invoker Client.

Used Technologies :

JDK 1.6.0_31
Spring 3.1.1
Tomcat 7.0
Maven 3.0.2