ChatMessage   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="ChatMessage"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ChatMessage.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/AntiBan.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/ClientUser.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/ChatMessage.html)
*   [No Frames](ChatMessage.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.simplebot

Class ChatMessage
-----------------

*   java.lang.Object
*   *   simple.hooks.simplebot.ChatMessage

*   * * *
    
      
    
    public class ChatMessage
    extends java.lang.Object
    
    Created by Seth on Nov 18, 2019 at 8:47:41 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `java.lang.String`
        
        `[message](../../../simple/hooks/simplebot/ChatMessage.html#message)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[ChatMessage](../../../simple/hooks/simplebot/ChatMessage.html#ChatMessage-net.runelite.api.events.ChatMessage-java.lang.String-java.lang.String-java.lang.String-net.runelite.api.ChatMessageType-)(net.runelite.api.events.ChatMessage chatEvent, java.lang.String message, java.lang.String name, java.lang.String sender, net.runelite.api.ChatMessageType type)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `net.runelite.api.events.ChatMessage`
        
        `[getChatEvent](../../../simple/hooks/simplebot/ChatMessage.html#getChatEvent--)()` 
        
        `java.lang.String`
        
        `[getFormattedMessage](../../../simple/hooks/simplebot/ChatMessage.html#getFormattedMessage--)()` 
        
        `java.lang.String`
        
        `[getMessage](../../../simple/hooks/simplebot/ChatMessage.html#getMessage--)()`
        
        Gets the message from the ChatEvent
        
        `java.lang.String`
        
        `[getName](../../../simple/hooks/simplebot/ChatMessage.html#getName--)()` 
        
        `java.lang.String`
        
        `[getSender](../../../simple/hooks/simplebot/ChatMessage.html#getSender--)()` 
        
        `net.runelite.api.ChatMessageType`
        
        `[getType](../../../simple/hooks/simplebot/ChatMessage.html#getType--)()`
        
        The type of the ChatEvent
        
        `boolean`
        
        `[isFriendsChatMessage](../../../simple/hooks/simplebot/ChatMessage.html#isFriendsChatMessage--)()` 
        
        `boolean`
        
        `[isPublicChatMessage](../../../simple/hooks/simplebot/ChatMessage.html#isPublicChatMessage--)()` 
        
        `boolean`
        
        `[isStaffPublicMessage](../../../simple/hooks/simplebot/ChatMessage.html#isStaffPublicMessage--)()` 
        
        `boolean`
        
        `[isYellMessage](../../../simple/hooks/simplebot/ChatMessage.html#isYellMessage--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### message
            
            public final java.lang.String message
            
    
    *   ### Constructor Detail
        
        *   #### ChatMessage
            
            public ChatMessage(net.runelite.api.events.ChatMessage chatEvent,
                               java.lang.String message,
                               java.lang.String name,
                               java.lang.String sender,
                               net.runelite.api.ChatMessageType type)
            
    
    *   ### Method Detail
        
        *   #### getChatEvent
            
            public net.runelite.api.events.ChatMessage getChatEvent()
            
        
        *   #### getMessage
            
            public java.lang.String getMessage()
            
            Gets the message from the ChatEvent
            
            Returns:
            
            \- The message received
            
        
        *   #### getFormattedMessage
            
            public java.lang.String getFormattedMessage()
            
        
        *   #### getName
            
            public java.lang.String getName()
            
            Returns:
            
            \- Name of the ChatEvent
            
        
        *   #### getSender
            
            public java.lang.String getSender()
            
            Returns:
            
            \- Name of the sender of the ChatEvent
            
        
        *   #### getType
            
            public net.runelite.api.ChatMessageType getType()
            
            The type of the ChatEvent
            
            Returns:
            
            \- ChatMessageType - type
            
        
        *   #### isYellMessage
            
            public boolean isYellMessage()
            
            Returns:
            
            \- If the message is a yell
            
        
        *   #### isFriendsChatMessage
            
            public boolean isFriendsChatMessage()
            
            Returns:
            
            \- If the message is a fc message
            
        
        *   #### isStaffPublicMessage
            
            public boolean isStaffPublicMessage()
            
            Returns:
            
            \- If the message sent if from a staff member and is of type=public
            
        
        *   #### isPublicChatMessage
            
            public boolean isPublicChatMessage()
            
            Returns:
            
            \- If the message is a public chat
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ChatMessage.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/AntiBan.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/ClientUser.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/ChatMessage.html)
*   [No Frames](ChatMessage.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)