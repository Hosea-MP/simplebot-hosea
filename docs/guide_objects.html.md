   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Interacting with Objects | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

[![SimpleBot Docs](/docs-api/assets/sb-logo.png)SimpleBot Docs](/docs-api/)

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

Search

⌃K

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

*   Guide
    
    *   [SimpleBot RuneLite API Documentation](/docs-api/guide/)
    *   [Query API](/docs-api/guide/query.html)
    *   [Interacting with NPCs](/docs-api/guide/npcs.html)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
        *   [Table of Contents](#table-of-contents)
        *   [Querying Objects](#querying-objects)
            *   [Finding an Object by Name](#finding-an-object-by-name)
            *   [Finding an Object by ID](#finding-an-object-by-id)
        *   [Interacting with Objects](#interacting-with-objects-1)
            *   [Interacting with an Object using click()](#interacting-with-an-object-using-click)
            *   [Interacting with an Object using menuAction()](#interacting-with-an-object-using-menuaction)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Interacting with Objects](#interacting-with-objects)
=====================================================

In Old School RuneScape (OSRS), objects play a crucial role in the game world. From doors and gates to trees and rocks, interacting with them effectively is essential for successful gameplay automation. This page explains how to query and interact with objects using the SimpleBot API.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Querying Objects](#querying-objects)
    *   [Finding an Object by Name](#finding-an-object-by-name)
    *   [Finding an Object by ID](#finding-an-object-by-id)
*   [Interacting with Objects](#interacting-with-objects)
    *   [Interacting with an Object using `click()`](#interacting-with-an-object-using-click)
        *   [Validating Interactability](#validating-interactability)
    *   [Interacting with an Object using `menuAction()`](#interacting-with-an-object-using-menuaction)

[Querying Objects](#querying-objects)
-------------------------------------

To interact with objects, you first need to find them within the game world. The SimpleBot API provides functions to search for objects by various attributes such as name, ID, or actions they can perform. You can learn more about querying in the [Querying](/docs-api/guide/query.html) guide.

### [Finding an Object by Name](#finding-an-object-by-name)

To find an object by name, use the `objects.populate().filter()` method. This returns the nearest object that matches the specified name. Here's an example:

    final SimpleObject door = ctx.objects.populate().filter("Door").nextNearest();
    if (door != null) {
        System.out.println("Found object: " + door.getName());
    } else {
        System.out.println("Object Door not found.");
    }
    

### [Finding an Object by ID](#finding-an-object-by-id)

To find an object by ID, use the `objects.populate().filter()` method with the object ID. This returns the nearest object with the specified ID. Here's an example:

    final SimpleObject tree = ctx.objects.populate().filter(1276).nextNearest();
    if (tree != null) {
        System.out.println("Found object: " + tree.getName());
    } else {
        System.out.println("Object ID 1276 not found.");
    }
    

[Interacting with Objects](#interacting-with-objects-1)
-------------------------------------------------------

Once you have found an object, you can interact with it in various ways. The SimpleBot API provides two methods to interact with objects: `click()` and `menuAction()`.

For more information on these two methods, refer to the [Interacting with Items](/docs-api/guide/items.html#interacting-with-items) guide.

### [Interacting with an Object using `click()`](#interacting-with-an-object-using-click)

To interact with an object using the `click()` method, you can specify the action name or action index.

**Note**: interacting with objects using the `click()` method requires the object to be within the viewport of the game client. If the object is not visible, you may need to move the camera or character to interact with it.

#### [Validating Interactability](#validating-interactability)

The api offers the `validateInteractable()` method to check if the object is within the viewport and can be interacted with. If the object is not interactable, it will move the camera and or character in an attempt to position the object within the viewport.

Here's an example of how to interact with an object using the `click()` method:

    final SimpleObject door = ctx.objects.populate().filter("Door").nextNearest();
    if (door != null) {
        if (door.validateInteractable()) {
            door.click("Open");
        } else {
            System.out.println("Object Door is not interactable.");
        }
    } else {
        System.out.println("Object Door not found.");
    }
    

### [Interacting with an Object using `menuAction()`](#interacting-with-an-object-using-menuaction)

To interact with an object using the `menuAction()` method, you can specify the action name or action index.

Using the `menuAction()` method allows you to interact with objects that are not within the viewport of the game client. This method sends a menu action to the object directly without requiring the object to be visible.

Here's an example of how to interact with an object using the `menuAction()` method:

    final SimpleObject door = ctx.objects.populate().filter("Door").nextNearest();
    if (door != null) {
        door.menuAction("Open");
    } else {
        System.out.println("Object Door not found.");
    }
    

Last Updated: 4/28/2024, 3:35:51 PM

Contributors: the-reminisce

[

Prev

Interacting with NPCs

](/docs-api/guide/npcs.html)[

Next

Interacting with Items and Inventory

](/docs-api/guide/items.html)