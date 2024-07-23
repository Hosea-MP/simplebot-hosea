LoopingScript   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="LoopingScript"; } } catch(err) { } //--> var methods = {"i0":6}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/LoopingScript.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/scripts/Category.html "enum in simple.hooks.scripts")
*   [Next Class](../../../simple/hooks/scripts/ScriptManifest.html "annotation in simple.hooks.scripts")

*   [Frames](../../../index.html?simple/hooks/scripts/LoopingScript.html)
*   [No Frames](LoopingScript.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)

simple.hooks.scripts

Interface LoopingScript
-----------------------

*   * * *
    
      
    
    public interface LoopingScript
    
    Created by Seth on May 5/6/2020, 2020 at 3:51 AM
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int`
        
        `[loopDuration](../../../simple/hooks/scripts/LoopingScript.html#loopDuration--)()`
        
        Changes the sleep duration between script loops Values : { default=150ms minimum=150ms maximum=1000ms } NOTE: a normal script loops at 600ms's, thus a LoopingScript can run at most four times faster than a normal script
        

*   *   ### Method Detail
        
        *   #### loopDuration
            
            int loopDuration()
            
            Changes the sleep duration between script loops Values : { default=150ms minimum=150ms maximum=1000ms } NOTE: a normal script loops at 600ms's, thus a LoopingScript can run at most four times faster than a normal script
            
            Returns:
            
            the amount of time to wait before looping script again
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/LoopingScript.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/scripts/Category.html "enum in simple.hooks.scripts")
*   [Next Class](../../../simple/hooks/scripts/ScriptManifest.html "annotation in simple.hooks.scripts")

*   [Frames](../../../index.html?simple/hooks/scripts/LoopingScript.html)
*   [No Frames](LoopingScript.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)