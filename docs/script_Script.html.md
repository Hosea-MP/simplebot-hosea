Script   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Script"; } } catch(err) { } //--> var methods = {"i0":10,"i1":6,"i2":6,"i3":6,"i4":6}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Script.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   Next Class

*   [Frames](../../../index.html?simple/robot/script/Script.html)
*   [No Frames](Script.html)

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

simple.robot.script

Class Script
------------

*   java.lang.Object
*   *   simple.robot.script.Script

*   All Implemented Interfaces:
    
    [Paintable](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
    
    Direct Known Subclasses:
    
    [TaskScript](../../../simple/hooks/scripts/task/TaskScript.html "class in simple.hooks.scripts.task")
    
    * * *
    
      
    
    public abstract class Script
    extends java.lang.Object
    implements [Paintable](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
    
    Seth Davis
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `[ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api")`
        
        `[ctx](../../../simple/robot/script/Script.html#ctx)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Script](../../../simple/robot/script/Script.html#Script--)()` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `java.lang.String`
        
        `[getStorageDirectory](../../../simple/robot/script/Script.html#getStorageDirectory--)()` 
        
        `abstract void`
        
        `[onChatMessage](../../../simple/robot/script/Script.html#onChatMessage-simple.hooks.simplebot.ChatMessage-)([ChatMessage](../../../simple/hooks/simplebot/ChatMessage.html "class in simple.hooks.simplebot") message)` 
        
        `abstract void`
        
        `[onExecute](../../../simple/robot/script/Script.html#onExecute--)()` 
        
        `abstract void`
        
        `[onProcess](../../../simple/robot/script/Script.html#onProcess--)()` 
        
        `abstract void`
        
        `[onTerminate](../../../simple/robot/script/Script.html#onTerminate--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.simplebot.[Paintable](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
            
            `[paint](../../../simple/hooks/simplebot/Paintable.html#paint-java.awt.Graphics-)`

*   *   ### Field Detail
        
        *   #### ctx
            
            public [ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx
            
    
    *   ### Constructor Detail
        
        *   #### Script
            
            public Script()
            
    
    *   ### Method Detail
        
        *   #### onExecute
            
            public abstract void onExecute()
            
        
        *   #### onProcess
            
            public abstract void onProcess()
            
        
        *   #### onTerminate
            
            public abstract void onTerminate()
            
        
        *   #### onChatMessage
            
            public abstract void onChatMessage([ChatMessage](../../../simple/hooks/simplebot/ChatMessage.html "class in simple.hooks.simplebot") message)
            
        
        *   #### getStorageDirectory
            
            public java.lang.String getStorageDirectory()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Script.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   Next Class

*   [Frames](../../../index.html?simple/robot/script/Script.html)
*   [No Frames](Script.html)

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