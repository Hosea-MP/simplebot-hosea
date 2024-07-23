TaskScript   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="TaskScript"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":6,"i3":6}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/TaskScript.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   [Prev Class](../../../../simple/hooks/scripts/task/Task.html "class in simple.hooks.scripts.task")
*   Next Class

*   [Frames](../../../../index.html?simple/hooks/scripts/task/TaskScript.html)
*   [No Frames](TaskScript.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#fields.inherited.from.class.simple.robot.script.Script) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.scripts.task

Class TaskScript
----------------

*   java.lang.Object
*   *   [simple.robot.script.Script](../../../../simple/robot/script/Script.html "class in simple.robot.script")
    *   *   simple.hooks.scripts.task.TaskScript

*   All Implemented Interfaces:
    
    [Paintable](../../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
    
    * * *
    
      
    
    public abstract class TaskScript
    extends [Script](../../../../simple/robot/script/Script.html "class in simple.robot.script")
    
    Created by Seth on Oct 1, 2019 at 5:55:30 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Field Summary
        
        *   ### Fields inherited from class simple.robot.script.[Script](../../../../simple/robot/script/Script.html "class in simple.robot.script")
            
            `[ctx](../../../../simple/robot/script/Script.html#ctx)`
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[TaskScript](../../../../simple/hooks/scripts/task/TaskScript.html#TaskScript--)()` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `java.lang.String`
        
        `[getScriptStatus](../../../../simple/hooks/scripts/task/TaskScript.html#getScriptStatus--)()` 
        
        `void`
        
        `[onProcess](../../../../simple/hooks/scripts/task/TaskScript.html#onProcess--)()` 
        
        `abstract boolean`
        
        `[prioritizeTasks](../../../../simple/hooks/scripts/task/TaskScript.html#prioritizeTasks--)()`
        
        Will give your specified tasks inserted in {tasks()} a sense of priority by checking tasks in order of insertion inside of {tasks}.
        
        `abstract java.util.List<[Task](../../../../simple/hooks/scripts/task/Task.html "class in simple.hooks.scripts.task")>`
        
        `[tasks](../../../../simple/hooks/scripts/task/TaskScript.html#tasks--)()`
        
        The lists of tasks the script will execute
        
        *   ### Methods inherited from class simple.robot.script.[Script](../../../../simple/robot/script/Script.html "class in simple.robot.script")
            
            `[getStorageDirectory](../../../../simple/robot/script/Script.html#getStorageDirectory--), [onChatMessage](../../../../simple/robot/script/Script.html#onChatMessage-simple.hooks.simplebot.ChatMessage-), [onExecute](../../../../simple/robot/script/Script.html#onExecute--), [onTerminate](../../../../simple/robot/script/Script.html#onTerminate--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.simplebot.[Paintable](../../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
            
            `[paint](../../../../simple/hooks/simplebot/Paintable.html#paint-java.awt.Graphics-)`

*   *   ### Constructor Detail
        
        *   #### TaskScript
            
            public TaskScript()
            
    
    *   ### Method Detail
        
        *   #### tasks
            
            public abstract java.util.List<[Task](../../../../simple/hooks/scripts/task/Task.html "class in simple.hooks.scripts.task")\> tasks()
            
            The lists of tasks the script will execute
            
            Returns:
            
            returns the list of tasks this script will run
            
        
        *   #### prioritizeTasks
            
            public abstract boolean prioritizeTasks()
            
            Will give your specified tasks inserted in {tasks()} a sense of priority by checking tasks in order of insertion inside of {tasks}. It will only check one task per script cycle if that tasks' {condition()} returns true.
            
            Returns:
            
            returns if your tasks are to be prioritized or not
            
        
        *   #### onProcess
            
            public void onProcess()
            
            Specified by:
            
            `[onProcess](../../../../simple/robot/script/Script.html#onProcess--)` in class `[Script](../../../../simple/robot/script/Script.html "class in simple.robot.script")`
            
        
        *   #### getScriptStatus
            
            public java.lang.String getScriptStatus()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/TaskScript.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   [Prev Class](../../../../simple/hooks/scripts/task/Task.html "class in simple.hooks.scripts.task")
*   Next Class

*   [Frames](../../../../index.html?simple/hooks/scripts/task/TaskScript.html)
*   [No Frames](TaskScript.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#fields.inherited.from.class.simple.robot.script.Script) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)