package com.enderdevelopment.skilltreemod.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SkillPointsRenderer {
    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            Minecraft mc = Minecraft.getMinecraft();
            FontRenderer fontRenderer = mc.fontRenderer;
            int skillPoints = getSkillPoints(); // Implement this method to get the current skill points
            fontRenderer.drawString("Skill Points: " + skillPoints, 10, 10, 0xFFFFFF);
        }
    }

    private int getSkillPoints() {
        // Implement this method to return the current skill points
        return 0;
    }
}