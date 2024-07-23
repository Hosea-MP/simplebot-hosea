SimpleInteractable   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleInteractable"; } } catch(err) { } //--> var methods = {"i0":18,"i1":18,"i2":18,"i3":6,"i4":18,"i5":18,"i6":18,"i7":18}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\],16:\["t5","Default Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleInteractable.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleInteractable.html)
*   [No Frames](SimpleInteractable.html)

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

simple.hooks.interfaces

Interface SimpleInteractable
----------------------------

*   All Superinterfaces:
    
    [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public interface SimpleInteractable
    extends [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
    
    Created by Seth on Nov 4, 2019 at 6:49:17 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) [Default Methods](javascript:show\(16\);) 
        
        Modifier and Type
        
        Method and Description
        
        `default boolean`
        
        `[click](../../../simple/hooks/interfaces/SimpleInteractable.html#click-int-)(int option)` 
        
        `default boolean`
        
        `[click](../../../simple/hooks/interfaces/SimpleInteractable.html#click-java.lang.String-)(java.lang.String option)` 
        
        `default boolean`
        
        `[click](../../../simple/hooks/interfaces/SimpleInteractable.html#click-java.lang.String-java.lang.String-)(java.lang.String option, java.lang.String object)` 
        
        `java.awt.geom.Rectangle2D`
        
        `[getClickBounds](../../../simple/hooks/interfaces/SimpleInteractable.html#getClickBounds--)()` 
        
        `default net.runelite.api.Point`
        
        `[getPointForType](../../../simple/hooks/interfaces/SimpleInteractable.html#getPointForType--)()` 
        
        `default boolean`
        
        `[turnTo](../../../simple/hooks/interfaces/SimpleInteractable.html#turnTo--)()` 
        
        `default boolean`
        
        `[validateInteractable](../../../simple/hooks/interfaces/SimpleInteractable.html#validateInteractable--)()` 
        
        `default boolean`
        
        `[visibleOnScreen](../../../simple/hooks/interfaces/SimpleInteractable.html#visibleOnScreen--)()` 
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
            
            `[getName](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`

*   *   ### Method Detail
        
        *   #### getClickBounds
            
            java.awt.geom.Rectangle2D getClickBounds()
            
        
        *   #### click
            
            default boolean click(java.lang.String option)
            
        
        *   #### click
            
            default boolean click(java.lang.String option,
                                  java.lang.String object)
            
        
        *   #### click
            
            default boolean click(int option)
            
        
        *   #### getPointForType
            
            default net.runelite.api.Point getPointForType()
            
        
        *   #### visibleOnScreen
            
            default boolean visibleOnScreen()
            
        
        *   #### validateInteractable
            
            default boolean validateInteractable()
            
        
        *   #### turnTo
            
            default boolean turnTo()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleInteractable.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleInteractable.html)
*   [No Frames](SimpleInteractable.html)

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