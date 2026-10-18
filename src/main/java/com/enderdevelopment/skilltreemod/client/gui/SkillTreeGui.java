package com.enderdevelopment.skilltreemod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class SkillTreeGui extends GuiContainer {
    public SkillTreeGui(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        // Draw the background layer of the GUI
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        // Draw the foreground layer of the GUI
    }
}