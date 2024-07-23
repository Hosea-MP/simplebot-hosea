Task   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Task"; } } catch(err) { } //--> var methods = {"i0":6,"i1":6,"i2":6}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Task.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../../simple/hooks/scripts/task/TaskScript.html "class in simple.hooks.scripts.task")

*   [Frames](../../../../index.html?simple/hooks/scripts/task/Task.html)
*   [No Frames](Task.html)

*   [All Classes](../../../../allclasses-noframe.html)

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

simple.hooks.scripts.task

Class Task
----------

*   java.lang.Object
*   *   simple.hooks.scripts.task.Task

*   * * *
    
      
    
    public abstract class Task
    extends java.lang.Object
    
    Created by Seth on Oct 1, 2019 at 5:53:28 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `[ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api")`
        
        `[ctx](../../../../simple/hooks/scripts/task/Task.html#ctx)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Task](../../../../simple/hooks/scripts/task/Task.html#Task-simple.robot.api.ClientContext-)([ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) 
        
        Modifier and Type
        
        Method and Description
        
        `abstract boolean`
        
        `[condition](../../../../simple/hooks/scripts/task/Task.html#condition--)()`
        
        The condition to check before running this task
        
        `abstract void`
        
        `[run](../../../../simple/hooks/scripts/task/Task.html#run--)()`
        
        This tasks' main body of code.
        
        `abstract java.lang.String`
        
        `[status](../../../../simple/hooks/scripts/task/Task.html#status--)()`
        
        The name of this task's status, used for printing it to the paint
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### ctx
            
            public [ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx
            
    
    *   ### Constructor Detail
        
        *   #### Task
            
            public Task([ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### condition
            
            public abstract boolean condition()
            
            The condition to check before running this task
            
            Returns:
            
            returns if the condition has been met or not
            
        
        *   #### run
            
            public abstract void run()
            
            This tasks' main body of code. This method is executed if the {condition()} is met.
            
        
        *   #### status
            
            public abstract java.lang.String status()
            
            The name of this task's status, used for printing it to the paint
            
            Returns:
            
            returns the task's name
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Task.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../../simple/hooks/scripts/task/TaskScript.html "class in simple.hooks.scripts.task")

*   [Frames](../../../../index.html?simple/hooks/scripts/task/Task.html)
*   [No Frames](Task.html)

*   [All Classes](../../../../allclasses-noframe.html)

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