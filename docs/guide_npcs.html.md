   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Interacting with NPCs | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

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
        *   [Table of Contents](#table-of-contents)
        *   [Querying NPCs](#querying-npcs)
            *   [Finding an NPC by Name](#finding-an-npc-by-name)
            *   [Finding an NPC by ID](#finding-an-npc-by-id)
        *   [Interacting with NPCs](#interacting-with-npcs-1)
            *   [Interacting with an NPC using click()](#interacting-with-an-npc-using-click)
            *   [Interacting with an NPC using menuAction()](#interacting-with-an-npc-using-menuaction)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Interacting with NPCs](#interacting-with-npcs)
===============================================

In Old School RuneScape (OSRS), NPCs (Non-Player Characters) play a crucial role. From quest givers and shop owners to enemies, interacting with them effectively is essential for successful gameplay automation. This page explains how to query and interact with NPCs using the SimpleBot API.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Querying NPCs](#querying-npcs)
    *   [Finding an NPC by Name](#finding-an-npc-by-name)
    *   [Finding an NPC by ID](#finding-an-npc-by-id)
*   [Interacting with NPCs](#interacting-with-npcs)
    *   [Interacting with an NPC using `click()`](#interacting-with-an-npc-using-click)
        *   [Validating Interactability](#validating-interactability)
    *   [Interacting with an NPC using `menuAction()`](#interacting-with-an-npc-using-menuaction)

[Querying NPCs](#querying-npcs)
-------------------------------

To interact with NPCs, you first need to find them within the game world. The SimpleBot API provides functions to search for NPCs by various attributes such as name, ID, or actions they can perform. You can learn more about querying in the [Querying](/docs-api/guide/query.html) guide.

### [Finding an NPC by Name](#finding-an-npc-by-name)

To find an NPC by name, use the `npcs.populate().filter()` method. This returns the nearest NPC that matches the specified name. Here's an example:

    final SimpleNpc bob = ctx.npc.populate().filter("Bob").nextNearest();
    if (bob != null) {
        System.out.println("Found NPC: " + bob.getName());
    } else {
        System.out.println("NPC Bob not found.");
    }
    

### [Finding an NPC by ID](#finding-an-npc-by-id)

To find an NPC by ID, use the `npcs.populate().filter()` method with the NPC ID. This returns the nearest NPC with the specified ID. Here's an example:

    final SimpleNpc banker = ctx.npc.populate().filter(494).nextNearest();
    if (banker != null) {
        System.out.println("Found NPC: " + banker.getName());
    } else {
        System.out.println("NPC ID 494 not found.");
    }
    

[Interacting with NPCs](#interacting-with-npcs-1)
-------------------------------------------------

Once you have found an NPC, you can interact with them in various ways. The SimpleBot API provides two methods to interact with NPCs: `click()` and `menuAction()`.

For more information on these two methods, refer to the [Interacting with Items](/docs-api/guide/items.html#interacting-with-items) guide.

### [Interacting with an NPC using `click()`](#interacting-with-an-npc-using-click)

To interact with an NPC using the `click()` method, you can specify the action name or action index.

**Note**: interacting with NPCs using the `click()` method requires the NPC to be within the viewport of the game client. If the NPC is not visible, you may need to move the camera or character to interact with them.

#### [Validating Interactability](#validating-interactability)

The api offers the `validateInteractable()` method to check if the NPC is within the viewport and can be interacted with. If the NPC is not interactable, it will move the camera and or character in an attempt to position the NPC within the viewport.

Here's an example of how to interact with an NPC using the `click()` method:

    final SimpleNpc goblin = ctx.npc.populate().filter("Goblin").nextNearest();
    if (goblin != null) {
        if (goblin.validateInteractable()) {
            goblin.click("Attack");
        } else {
            System.out.println("Goblin is not visible, we can't interact with it.");
        }
    } else {
        System.out.println("NPC Goblin not found.");
    }
    

### [Interacting with an NPC using `menuAction()`](#interacting-with-an-npc-using-menuaction)

To interact with an NPC using the `menuAction()` method, you can specify the action name or action index.

Using the `menuAction()` method allows you to interact with NPCs even if they are not within the viewport of the game client. This method sends a menu action to the NPC directly without requiring the NPC to be visible.

Here's an example of how to interact with an NPC using the `menuAction()` method:

    final SimpleNpc goblin = ctx.npc.populate().filter("Goblin").nextNearest();
    if (goblin != null) {
        goblin.menuAction("Attack");
    } else {
        System.out.println("NPC Goblin not found.");
    }
    

Last Updated: 4/28/2024, 3:35:51 PM

Contributors: the-reminisce

[

Prev

Query API

](/docs-api/guide/query.html)[

Next

Interacting with Objects

](/docs-api/guide/objects.html)