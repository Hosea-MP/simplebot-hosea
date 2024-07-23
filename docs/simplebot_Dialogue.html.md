Dialogue   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Dialogue"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Dialogue.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Definitions.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/FairyRing.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Dialogue.html)
*   [No Frames](Dialogue.html)

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

Class Dialogue
--------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[SimpleChatOption](../../../simple/hooks/wrappers/SimpleChatOption.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.simplebot.Dialogue

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleChatOption](../../../simple/hooks/wrappers/SimpleChatOption.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class Dialogue
    extends [SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[SimpleChatOption](../../../simple/hooks/wrappers/SimpleChatOption.html "class in simple.hooks.wrappers")\>
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `int`
        
        `[CHAT_WIDGET](../../../simple/hooks/simplebot/Dialogue.html#CHAT_WIDGET)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Dialogue](../../../simple/hooks/simplebot/Dialogue.html#Dialogue-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[canContinue](../../../simple/hooks/simplebot/Dialogue.html#canContinue--)()`
        
        Will return if the current open chatbox has the continue button
        
        `boolean`
        
        `[clickContinue](../../../simple/hooks/simplebot/Dialogue.html#clickContinue--)()`
        
        Will click the continue button in the chatbox
        
        `boolean`
        
        `[clickDialogueOption](../../../simple/hooks/simplebot/Dialogue.html#clickDialogueOption-int-)(int option)`
        
        Will click specified {option} in chatbox
        
        `boolean`
        
        `[dialogueOpen](../../../simple/hooks/simplebot/Dialogue.html#dialogueOpen--)()`
        
        Will return if you have a chatbox open or not
        
        `[SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        `[getContinueButton](../../../simple/hooks/simplebot/Dialogue.html#getContinueButton--)()`
        
        Will return the SimpleWidget resembling the continue button
        
        `[SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        `[getDialogueOptions](../../../simple/hooks/simplebot/Dialogue.html#getDialogueOptions--)()`
        
        Will return an array of SimpleWidgets resembling the open options inside of the chatbox
        
        `java.lang.String[]`
        
        `[getDialogueTitleAndMessage](../../../simple/hooks/simplebot/Dialogue.html#getDialogueTitleAndMessage--)()` 
        
        `[SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        `[getOpenDialogueWidget](../../../simple/hooks/simplebot/Dialogue.html#getOpenDialogueWidget--)()`
        
        Will return a SimpleWidget resembling the chatbox that is currently open
        
        `boolean`
        
        `[pendingInput](../../../simple/hooks/simplebot/Dialogue.html#pendingInput--)()`
        
        Will return true if withdraw-x in bank amount input is open for example
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")
            
            `[filterContains](../../../simple/hooks/queries/SimpleTextQuery.html#filterContains-java.lang.String...-), [filterExact](../../../simple/hooks/queries/SimpleTextQuery.html#filterExact-java.lang.String...-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Field Detail
        
        *   #### CHAT\_WIDGET
            
            public final int CHAT\_WIDGET
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Dialogue.CHAT_WIDGET)
            
    
    *   ### Constructor Detail
        
        *   #### Dialogue
            
            public Dialogue([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### getOpenDialogueWidget
            
            public [SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") getOpenDialogueWidget()
            
            Will return a SimpleWidget resembling the chatbox that is currently open
            
            Returns:
            
            returns the widget for the open dialogue in your chatbox, {null} if there is no dialogue open
            
        
        *   #### dialogueOpen
            
            public boolean dialogueOpen()
            
            Will return if you have a chatbox open or not
            
            Returns:
            
            returns if a chatbox is open
            
        
        *   #### getDialogueOptions
            
            public [SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")\[\] getDialogueOptions()
            
            Will return an array of SimpleWidgets resembling the open options inside of the chatbox
            
            Returns:
            
            returns an array of the dialogue option buttons, {null} if no chatbox is open
            
        
        *   #### clickDialogueOption
            
            public boolean clickDialogueOption(int option)
            
            Will click specified {option} in chatbox
            
            Parameters:
            
            `option` - 1 out of 5
            
            Returns:
            
            returns if the {option} in the chatbox was clicked or not
            
        
        *   #### canContinue
            
            public boolean canContinue()
            
            Will return if the current open chatbox has the continue button
            
            Returns:
            
            returns if the continue button is valid
            
        
        *   #### clickContinue
            
            public boolean clickContinue()
            
            Will click the continue button in the chatbox
            
            Returns:
            
            returns if the continue button was clicked or not
            
        
        *   #### getContinueButton
            
            public [SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") getContinueButton()
            
            Will return the SimpleWidget resembling the continue button
            
            Returns:
            
            returns the continue button widget if there is a chatbox open with said button
            
        
        *   #### getDialogueTitleAndMessage
            
            public java.lang.String\[\] getDialogueTitleAndMessage()
            
            Returns:
            
            \- an array of 2 elements, \[0\] being the {dialogues title}, and \[1\] being the {dialogues message}, {null} if there is no dialogue open
            
        
        *   #### pendingInput
            
            public boolean pendingInput()
            
            Will return true if withdraw-x in bank amount input is open for example
            
            Returns:
            
            \- if there is an input chatbox open
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Dialogue.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Definitions.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/FairyRing.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Dialogue.html)
*   [No Frames](Dialogue.html)

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