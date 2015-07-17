package com.bobmowzie.mowziesmobs.client.model.entity;

import com.bobmowzie.mowziesmobs.client.model.tools.MowzieModelBase;
import com.bobmowzie.mowziesmobs.client.model.tools.MowzieModelRenderer;
import com.bobmowzie.mowziesmobs.common.animation.MMAnimation;
import com.bobmowzie.mowziesmobs.common.entity.EntityFoliaath;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

public class ModelFoliaath extends MowzieModelBase
{
    public MowzieModelRenderer bigLeaf2Base;
    public MowzieModelRenderer bigLeaf1Base;
    public MowzieModelRenderer bigLeaf4Base;
    public MowzieModelRenderer bigLeaf3Base;
    public MowzieModelRenderer stem1Base;
    public MowzieModelRenderer stem1Joint;
    public MowzieModelRenderer stem2;
    public MowzieModelRenderer stem3;
    public MowzieModelRenderer stem4;
    public MowzieModelRenderer headBase;
    public MowzieModelRenderer mouthTop1;
    public MowzieModelRenderer leaf1Head;
    public MowzieModelRenderer leaf2Head;
    public MowzieModelRenderer leaf3Head;
    public MowzieModelRenderer leaf4Head;
    public MowzieModelRenderer leaf5Head;
    public MowzieModelRenderer leaf6Head;
    public MowzieModelRenderer leaf7Head;
    public MowzieModelRenderer leaf8Head;
    public MowzieModelRenderer tongue1Base;
    public MowzieModelRenderer mouthBack;
    public MowzieModelRenderer mouthBottom1;
    public MowzieModelRenderer mouthTop2;
    public MowzieModelRenderer teethTop1;
    public MowzieModelRenderer teethTop2;
    public MowzieModelRenderer tongue2;
    public MowzieModelRenderer tongue3;
    public MowzieModelRenderer mouthBottom2;
    public MowzieModelRenderer teethBottom1;
    public MowzieModelRenderer teethBottom2;
    public MowzieModelRenderer bigLeaf2End;
    public MowzieModelRenderer bigLeaf1End;
    public MowzieModelRenderer bigLeaf4End;
    public MowzieModelRenderer bigLeaf3End;
    public MowzieModelRenderer[] stemParts;
    public MowzieModelRenderer[] tongueParts;
    public MowzieModelRenderer[] leafParts1;
    public MowzieModelRenderer[] leafParts2;
    public MowzieModelRenderer[] leafParts3;
    public MowzieModelRenderer[] leafParts4;
    private float activeProgress;

    private Animator animator;

    public ModelFoliaath()
    {
        textureWidth = 128;
        textureHeight = 64;
        animator = new Animator(this);

        headBase = new MowzieModelRenderer(this, 80, 15);
        headBase.setRotationPoint(0.0F, -10.0F, 0.0F);
        headBase.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 2, 0.0F);
        setRotateAngle(headBase, 1.3658946726107624F, 0.0F, 0.0F);
        leaf6Head = new MowzieModelRenderer(this, 0, 18);
        leaf6Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf6Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf6Head, 0.6829473363053812F, 0.0F, 3.9269908169872414F);
        bigLeaf3End = new MowzieModelRenderer(this, 64, 0);
        bigLeaf3End.setRotationPoint(0.0F, -14.0F, 0.0F);
        bigLeaf3End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf3End, -1.2292353921796064F, 0.0F, 0.0F);
        stem1Base = new MowzieModelRenderer(this, 0, 0);
        stem1Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        stem1Base.addBox(-1.5F, -15.0F, -1.5F, 3, 15, 3, 0.0F);
        setRotateAngle(stem1Base, 0.136659280431156F, 0.0F, 0.0F);
        stem1Joint = new MowzieModelRenderer(this, 0, 0);
        stem1Joint.setRotationPoint(0.0F, 24.0F, 0.0F);
        stem1Joint.addBox(0F, 0F, 0F, 0, 0, 0, 0.0F);
        setRotateAngle(stem1Joint, 0.0F, 0.0F, 0.0F);
        teethBottom2 = new MowzieModelRenderer(this, 15, 22);
        teethBottom2.setRotationPoint(0.0F, 0.0F, 0.0F);
        teethBottom2.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        tongue1Base = new MowzieModelRenderer(this, 40, 26);
        tongue1Base.setRotationPoint(0.0F, 0.0F, 2.0F);
        tongue1Base.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        bigLeaf2Base = new MowzieModelRenderer(this, 64, 14);
        bigLeaf2Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        bigLeaf2Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf2Base, -0.6829473363053812F, 2.356194490192345F, 0.0F);
        mouthBack = new MowzieModelRenderer(this, 54, 37);
        mouthBack.setRotationPoint(0.0F, -0.5F, 2.0F);
        mouthBack.addBox(-6.0F, -4.5F, 0.0F, 12, 9, 2, 0.0F);
        bigLeaf1End = new MowzieModelRenderer(this, 64, 0);
        bigLeaf1End.setRotationPoint(0.0F, -14.0F, 0.0F);
        bigLeaf1End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf1End, -1.2292353921796064F, 0.0F, 0.0F);
        leaf4Head = new MowzieModelRenderer(this, 0, 18);
        leaf4Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf4Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf4Head, 0.6829473363053812F, 0.0F, 2.356194490192345F);
        mouthBottom2 = new MowzieModelRenderer(this, 36, 16);
        mouthBottom2.setRotationPoint(0.0F, 0.0F, 12.0F);
        mouthBottom2.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
        leaf5Head = new MowzieModelRenderer(this, 0, 18);
        leaf5Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf5Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf5Head, 0.6829473363053812F, 0.0F, 3.141592653589793F);
        leaf3Head = new MowzieModelRenderer(this, 0, 18);
        leaf3Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf3Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf3Head, 0.6829473363053812F, 0.0F, 1.5707963267948966F);
        bigLeaf1Base = new MowzieModelRenderer(this, 64, 14);
        bigLeaf1Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        bigLeaf1Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf1Base, -0.6829473363053812F, 0.7853981633974483F, 0.0F);
        bigLeaf4End = new MowzieModelRenderer(this, 64, 0);
        bigLeaf4End.setRotationPoint(0.0F, -14.0F, 0.0F);
        bigLeaf4End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf4End, -1.2292353921796064F, 0.0F, 0.0F);
        mouthBottom1 = new MowzieModelRenderer(this, 16, 0);
        mouthBottom1.setRotationPoint(0.0F, 1.0F, 2.0F);
        mouthBottom1.addBox(-6.0F, -4.0F, 0.0F, 12, 4, 12, 0.0F);
        setRotateAngle(mouthBottom1, 0.0F, 0.0F, 3.141592653589793F);
        leaf8Head = new MowzieModelRenderer(this, 0, 18);
        leaf8Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf8Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf8Head, 0.6829473363053812F, 0.0F, 5.497787143782138F);
        leaf2Head = new MowzieModelRenderer(this, 0, 18);
        leaf2Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf2Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf2Head, 0.6829473363053812F, 0.0F, 0.7853981633974483F);
        teethBottom1 = new MowzieModelRenderer(this, 80, 0);
        teethBottom1.setRotationPoint(0.0F, 0.0F, 0.0F);
        teethBottom1.addBox(-6.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        tongue3 = new MowzieModelRenderer(this, 80, 24);
        tongue3.setRotationPoint(0.0F, 0.0F, 6.0F);
        tongue3.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F);
        leaf1Head = new MowzieModelRenderer(this, 0, 18);
        leaf1Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf1Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf1Head, 0.6829473363053812F, 0.0F, 0.0F);
        teethTop2 = new MowzieModelRenderer(this, 15, 22);
        teethTop2.setRotationPoint(0.0F, 0.0F, 0.0F);
        teethTop2.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        stem3 = new MowzieModelRenderer(this, 0, 0);
        stem3.setRotationPoint(0.0F, -15.0F, 0.0F);
        stem3.addBox(-1.5F, -13.0F, -1.5F, 3, 13, 3, 0.0F);
        setRotateAngle(stem3, -1.1383037381507017F, 0.0F, 0.0F);
        stem2 = new MowzieModelRenderer(this, 0, 0);
        stem2.setRotationPoint(0.0F, -15.0F, 0.0F);
        stem2.addBox(-1.5F, -15.0F, -1.5F, 3, 15, 3, 0.0F);
        setRotateAngle(stem2, 0.36425021489121656F, 0.0F, 0.0F);
        bigLeaf3Base = new MowzieModelRenderer(this, 64, 14);
        bigLeaf3Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        bigLeaf3Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf3Base, -0.6829473363053812F, 3.9269908169872414F, 0.0F);
        bigLeaf4Base = new MowzieModelRenderer(this, 64, 14);
        bigLeaf4Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        bigLeaf4Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf4Base, -0.6829473363053812F, 5.497787143782138F, 0.0F);
        tongue2 = new MowzieModelRenderer(this, 40, 26);
        tongue2.setRotationPoint(0.0F, 0.0F, 6.0F);
        tongue2.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        mouthTop2 = new MowzieModelRenderer(this, 36, 16);
        mouthTop2.setRotationPoint(0.0F, 0.0F, 12.0F);
        mouthTop2.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
        bigLeaf2End = new MowzieModelRenderer(this, 64, 0);
        bigLeaf2End.setRotationPoint(0.0F, -14.0F, 0.0F);
        bigLeaf2End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        setRotateAngle(bigLeaf2End, -1.2292353921796064F, 0.0F, 0.0F);
        stem4 = new MowzieModelRenderer(this, 0, 0);
        stem4.setRotationPoint(0.0F, -13.0F, 0.0F);
        stem4.addBox(-1.5F, -10.0F, -1.5F, 3, 10, 3, 0.0F);
        setRotateAngle(stem4, -0.9105382707654417F, 0.0F, 0.0F);
        teethTop1 = new MowzieModelRenderer(this, 80, 0);
        teethTop1.setRotationPoint(0.0F, 0.0F, 0.0F);
        teethTop1.addBox(-6.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        mouthTop1 = new MowzieModelRenderer(this, 16, 0);
        mouthTop1.setRotationPoint(0.0F, -2.0F, 2.0F);
        mouthTop1.addBox(-6.0F, -4.0F, 0.0F, 12, 4, 12, 0.0F);
        leaf7Head = new MowzieModelRenderer(this, 0, 18);
        leaf7Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        leaf7Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        setRotateAngle(leaf7Head, 0.6829473363053812F, 0.0F, 4.71238898038469F);
        stem4.addChild(headBase);
        headBase.addChild(leaf6Head);
        bigLeaf3Base.addChild(bigLeaf3End);
        mouthBottom2.addChild(teethBottom2);
        headBase.addChild(tongue1Base);
        headBase.addChild(mouthBack);
        bigLeaf1Base.addChild(bigLeaf1End);
        headBase.addChild(leaf4Head);
        mouthBottom1.addChild(mouthBottom2);
        headBase.addChild(leaf5Head);
        headBase.addChild(leaf3Head);
        bigLeaf4Base.addChild(bigLeaf4End);
        headBase.addChild(mouthBottom1);
        headBase.addChild(leaf8Head);
        headBase.addChild(leaf2Head);
        mouthBottom1.addChild(teethBottom1);
        tongue2.addChild(tongue3);
        headBase.addChild(leaf1Head);
        mouthTop2.addChild(teethTop2);
        stem2.addChild(stem3);
        stem1Base.addChild(stem2);
        stem1Joint.addChild(stem1Base);
        tongue1Base.addChild(tongue2);
        mouthTop1.addChild(mouthTop2);
        bigLeaf2Base.addChild(bigLeaf2End);
        stem3.addChild(stem4);
        mouthTop1.addChild(teethTop1);
        headBase.addChild(mouthTop1);
        headBase.addChild(leaf7Head);

        stemParts = new MowzieModelRenderer[]{headBase, stem4, stem3, stem2, stem1Base};
        tongueParts = new MowzieModelRenderer[]{tongue1Base, tongue2, tongue3};
        leafParts1 = new MowzieModelRenderer[]{bigLeaf1End, bigLeaf1Base};
        leafParts2 = new MowzieModelRenderer[]{bigLeaf2End, bigLeaf2Base};
        leafParts3 = new MowzieModelRenderer[]{bigLeaf3End, bigLeaf3Base};
        leafParts4 = new MowzieModelRenderer[]{bigLeaf4End, bigLeaf4Base};

        stem1Joint.rotationPointY += 2;
        stem1Joint.rotateAngleX += 0.05;
        stem2.rotateAngleX += 0.3;
        stem3.rotateAngleX += -0.1;
        headBase.rotateAngleX += -0.35;
        stem1Base.setRotationPoint(0, 0, 0);

        parts = new MowzieModelRenderer[]{stem1Joint, stem1Base, bigLeaf2Base, bigLeaf1Base, bigLeaf4Base, bigLeaf3Base, stem2, stem3, stem4, headBase, mouthTop1, leaf1Head, leaf2Head, leaf3Head, leaf4Head, leaf5Head, leaf6Head, leaf7Head, leaf8Head, tongue1Base, mouthBack, mouthBottom1, mouthTop2, teethTop1, teethTop2, tongue2, tongue3, mouthBottom2, teethBottom1, teethBottom2, bigLeaf2End, bigLeaf1End, bigLeaf4End, bigLeaf3End};
        setInitPose();
    }

    public void render(Entity foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        animate((IAnimatedEntity) foliaath, f, f1, f2, f3, f4, f5);
        float leafScale = 1.25F;
        GL11.glScalef(leafScale, leafScale, leafScale);
        bigLeaf2Base.rotationPointY -= 3.5;
        bigLeaf1Base.rotationPointY -= 3.5;
        bigLeaf3Base.rotationPointY -= 3.5;
        bigLeaf4Base.rotationPointY -= 3.5;
        bigLeaf2Base.render(f5);
        bigLeaf1Base.render(f5);
        bigLeaf3Base.render(f5);
        bigLeaf4Base.render(f5);
        GL11.glScalef(1 / leafScale, 1 / leafScale, 1 / leafScale);
        GL11.glTranslatef(0, 1.4F, 0);
        GL11.glTranslatef(0, -1.4F * activeProgress, 0);
        GL11.glScalef(activeProgress, activeProgress, activeProgress);
        stem1Joint.render(f5);
    }

    public void setRotateAngle(MowzieModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(EntityFoliaath foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, foliaath);

        stem1Joint.rotateAngleY += (f3 / (180f / (float) Math.PI));
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float f, float f1, float partialTicks)
    {
        EntityFoliaath foliaath = (EntityFoliaath) entity;
        animator.update(foliaath);
        setToInitPose();

        activeProgress = foliaath.activate.getAnimationProgressSinSqrt();
        float activeIntermittent = foliaath.activate.getAnimationProgressSinSqrt() - foliaath.activate.getAnimationProgressSinToTenWithoutReturn();
        float activeComplete = activeProgress - activeIntermittent;
        float stopDance = foliaath.stopDance.getAnimationProgressSinSqrt() - (foliaath.stopDance.getAnimationProgressSinSqrt() - foliaath.stopDance.getAnimationProgressSinToTenWithoutReturn());
        float frame = foliaath.frame + partialTicks;

        float globalSpeed = 0.9f;

        flap(stem1Base, 0.25F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 0F, 0F, frame, 1F);
        walk(stem1Base, 0.5F * globalSpeed, 0.05F * (activeComplete - stopDance), false, 0F, 0F, frame, 1F);
        walk(stem2, 0.5F * globalSpeed, 0.05F * (activeComplete - stopDance), false, 0.5F, 0F, frame, 1F);
        walk(stem3, 0.5F * globalSpeed, 0.07F * (activeComplete - stopDance), false, 1F, 0F, frame, 1F);
        walk(stem4, 0.5F * globalSpeed, 0.05F * (activeComplete - stopDance), false, 1.5F, 0F, frame, 1F);
        walk(headBase, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), true, 1.3F, 0F, frame, 1F);
        headBase.rotateAngleY += rotateBox(0.25F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 0F, 0F, frame, 1F);
        walk(leaf1Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf2Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf3Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf4Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf5Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf6Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf7Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        walk(leaf8Head, 0.5F * globalSpeed, 0.15F * (activeComplete - stopDance), false, 3F, -0.1F, frame, 1F);
        chainWave(leafParts1, 0.5F * globalSpeed, 0.13F * (activeComplete - stopDance), 2, frame, 1F);
        chainWave(leafParts2, 0.5F * globalSpeed, 0.13F * (activeComplete - stopDance), 2, frame, 1F);
        chainWave(leafParts3, 0.5F * globalSpeed, 0.13F * (activeComplete - stopDance), 2, frame, 1F);
        chainWave(leafParts4, 0.5F * globalSpeed, 0.13F * (activeComplete - stopDance), 2, frame, 1F);

        //Open Mouth Animation
        float openMouthProgress = foliaath.openMouth.getAnimationProgressSinSqrt();
        float openMouthIntermittent = foliaath.openMouth.getAnimationProgressSinSqrt() - foliaath.openMouth.getAnimationProgressSinToTenWithoutReturn();
        float headLeafRotation = 0.2F * openMouthProgress - 0.8F * openMouthIntermittent;
        mouthTop1.rotateAngleX -= 0.3 * openMouthIntermittent;
        mouthBottom1.rotateAngleX -= 0.3 * openMouthIntermittent;
        mouthTop2.rotateAngleX += 0.3 * openMouthIntermittent;
        mouthBottom2.rotateAngleX += 0.3 * openMouthIntermittent;
        stem2.rotateAngleX += 0.9 * openMouthIntermittent;
        stem3.rotateAngleX -= 0.6 * openMouthIntermittent;
        stem4.rotateAngleX -= 0.6 * openMouthIntermittent;
        headBase.rotateAngleX += 0.6 * openMouthIntermittent;
        flap(headBase, 1.5F, 0.6F * openMouthIntermittent, false, 0F, 0F, frame, 1F);
        mouthTop1.rotateAngleX += 0.15 * openMouthProgress;
        mouthBottom1.rotateAngleX += 0.15 * openMouthProgress;
        chainWave(tongueParts, 0.5F * globalSpeed, -0.15F * (openMouthProgress - openMouthIntermittent), -2, frame, 1F);
        tongue1Base.rotateAngleY += 0.3 * (openMouthProgress - openMouthIntermittent);
        tongue2.rotateAngleY += 0.4 * (openMouthProgress - openMouthIntermittent);
        tongue2.rotateAngleX -= 0.1 * (openMouthProgress - openMouthIntermittent);
        tongue3.rotateAngleX -= 0.5 * (openMouthProgress - openMouthIntermittent);
        stem1Base.rotateAngleX -= 0.2 * openMouthProgress;
        stem2.rotateAngleX -= 0.1 * openMouthProgress;
        stem3.rotateAngleX -= 0.1 * openMouthProgress;
        stem4.rotateAngleX -= 0.1 * openMouthProgress;
        headBase.rotateAngleX += 0.6 * openMouthProgress;
        leaf1Head.rotateAngleX -= headLeafRotation;
        leaf2Head.rotateAngleX -= headLeafRotation;
        leaf3Head.rotateAngleX -= headLeafRotation;
        leaf4Head.rotateAngleX -= headLeafRotation;
        leaf5Head.rotateAngleX -= headLeafRotation;
        leaf6Head.rotateAngleX -= headLeafRotation;
        leaf7Head.rotateAngleX -= headLeafRotation;
        leaf8Head.rotateAngleX -= headLeafRotation;

        //Activate Animation
        chainFlap(stemParts, 0.7F, 0.2F * 2 * activeIntermittent, 2F, frame, 1F);
        chainSwing(tongueParts, 0.7F, 0.6F * 2 * activeIntermittent, -2F, frame, 1F);
        chainWave(leafParts1, 1.5F, 0.1F * 2 * activeIntermittent, 0, frame, 1F);
        chainWave(leafParts2, 1.5F, 0.1F * 2 * activeIntermittent, 0, frame, 1F);
        chainWave(leafParts3, 1.5F, 0.1F * 2 * activeIntermittent, 0, frame, 1F);
        chainWave(leafParts4, 1.5F, 0.1F * 2 * activeIntermittent, 0, frame, 1F);
        stem1Base.rotateAngleX -= 0.1 * 2 * activeIntermittent;
        stem2.rotateAngleX -= 0.5 * 2 * activeIntermittent;
        stem3.rotateAngleX += 0.9 * 2 * activeIntermittent;
        stem4.rotateAngleX += 0.6 * 2 * activeIntermittent;
        headBase.rotateAngleX += 0.6 * 2 * activeIntermittent;
        mouthTop1.rotateAngleX += 0.4 * 2 * activeIntermittent;
        mouthBottom1.rotateAngleX += 0.4 * 2 * activeIntermittent;
    }

    public void animate(IAnimatedEntity foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFoliaath entityfoliaath = (EntityFoliaath) foliaath;
        setRotationAngles(entityfoliaath, f, f1, f2, f3, f4, f5);

        //Bite
        animator.setAnim(MMAnimation.ATTACK.animID());
        animator.startPhase(3);
        animator.rotate(stem1Base, 0.4F, 0, 0);
        animator.rotate(stem2, -0.3F, 0, 0);
        animator.rotate(stem3, 0.2F, 0, 0);
        animator.rotate(stem4, 0.2F, 0, 0);
        animator.rotate(headBase, -0.6F, 0, 0);
        animator.rotate(mouthTop1, 0.8F, 0, 0);
        animator.rotate(mouthBottom1, 0.8F, 0, 0);
        animator.rotate(tongue1Base, -0.2F, 0, 0);
        animator.rotate(tongue2, -0.5F, 0, 0);
        animator.move(tongue2, 0, -0.3F, 0);
        animator.rotate(tongue3, 0.4F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(1);
        animator.startPhase(2);
        animator.rotate(stem1Base, -0.6F, 0, 0);
        animator.rotate(stem2, -1.2F, 0, 0);
        animator.rotate(stem3, 0.8F, 0, 0);
        animator.rotate(stem4, 0.8F, 0, 0);
        animator.rotate(headBase, 0.4F, 0, 0);
        animator.rotate(mouthTop1, -0.1F, 0, 0);
        animator.rotate(mouthBottom1, -0.1F, 0, 0);
        animator.rotate(mouthTop2, 0.15F, 0, 0);
        animator.rotate(mouthBottom2, 0.15F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(3);
        animator.resetPhase(5);

        animator.setAnim(MMAnimation.TAKEDAMAGE.animID());
        animator.startPhase(3);
        animator.rotate(stem2, 0.6F, 0, 0);
        animator.rotate(stem3, -0.4F, 0, 0);
        animator.rotate(stem4, -0.4F, 0, 0);
        animator.rotate(headBase, -0.2F, 0, 0);
        animator.rotate(leaf1Head, 0.6F, 0, 0);
        animator.rotate(leaf2Head, 0.6F, 0, 0);
        animator.rotate(leaf3Head, 0.6F, 0, 0);
        animator.rotate(leaf4Head, 0.6F, 0, 0);
        animator.rotate(leaf5Head, 0.6F, 0, 0);
        animator.rotate(leaf6Head, 0.6F, 0, 0);
        animator.rotate(leaf7Head, 0.6F, 0, 0);
        animator.rotate(leaf8Head, 0.6F, 0, 0);
        animator.endPhase();
        animator.resetPhase(7);

        float deathFlailProgress = entityfoliaath.deathFlail.getAnimationProgressSinSqrt();
        chainFlap(stemParts, 0.7F, 0.2F * deathFlailProgress, 2F, entityfoliaath.frame, 1F);
        chainSwing(tongueParts, 0.7F, 0.6F * deathFlailProgress, -2F, entityfoliaath.frame, 1F);
        chainWave(leafParts1, 1.5F, 0.1F * deathFlailProgress, 0, entityfoliaath.frame, 1F);
        chainWave(leafParts2, 1.5F, 0.1F * deathFlailProgress, 0, entityfoliaath.frame, 1F);
        chainWave(leafParts3, 1.5F, 0.1F * deathFlailProgress, 0, entityfoliaath.frame, 1F);
        chainWave(leafParts4, 1.5F, 0.1F * deathFlailProgress, 0, entityfoliaath.frame, 1F);
        animator.setAnim(MMAnimation.DIE.animID());
        animator.startPhase(4);
        animator.rotate(stem1Base, -0.1F, 0, 0);
        animator.rotate(stem2, -0.5F, 0, 0);
        animator.rotate(stem3, 0.9F, 0, 0);
        animator.rotate(stem4, 0.6F, 0, 0);
        animator.rotate(headBase, 0.6F, 0, 0);
        animator.rotate(mouthTop1, 0.4F, 0, 0);
        animator.rotate(mouthBottom1, 0.4F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(10);
        animator.startPhase(5);
        animator.rotate(stem1Base, -0.1F, 0, 0);
        animator.rotate(stem2, -0.5F, 0, 0);
        animator.rotate(stem3, 0.9F, 0, 0);
        animator.rotate(stem4, 0.6F, 0, 0);
        animator.rotate(headBase, 0.6F, 0, 0);
        animator.rotate(stem1Joint, 0, -0.4F, 0);
        animator.rotate(stem1Base, -0.6F, 0, 0);
        animator.rotate(stem2, -0.7F, 0, 0);
        animator.rotate(stem3, -0.6F, 0, 0);
        animator.rotate(stem4, -0.6F, 0, 0);
        animator.rotate(headBase, 1.25F, 0, 0);
        animator.rotate(mouthTop1, 0.1F, -0.05F, 0);
        animator.rotate(tongue1Base, 0, 0.3F, 0);
        animator.rotate(tongue2, -0.1F, 0.4F, 0);
        animator.rotate(tongue3, -0.5F, 0F, 0);
        animator.rotate(leaf1Head, 0.7F, 0, 0);
        animator.rotate(leaf2Head, 0.7F, 0, 0);
        animator.rotate(leaf3Head, 0.7F, 0, 0);
        animator.rotate(leaf4Head, 0.7F, 0, 0);
        animator.rotate(leaf5Head, 0.7F, 0, 0);
        animator.rotate(leaf6Head, 0.7F, 0, 0);
        animator.rotate(leaf7Head, 0.7F, 0, 0);
        animator.rotate(leaf8Head, 0.7F, 0, 0);
        animator.endPhase();
        animator.startPhase(2);
        animator.rotate(stem1Base, -0.1F, 0, 0);
        animator.rotate(stem2, -0.5F, 0, 0);
        animator.rotate(stem3, 0.9F, 0, 0);
        animator.rotate(stem4, 0.6F, 0, 0);
        animator.rotate(headBase, 0.6F, 0, 0);
        animator.rotate(stem1Joint, 0, -0.4F, 0);
        animator.rotate(stem1Base, -0.5F, 0, 0);
        animator.rotate(stem2, -0.6F, 0, 0);
        animator.rotate(stem3, -0.5F, 0, 0);
        animator.rotate(stem4, -0.5F, 0, 0);
        animator.rotate(headBase, 0.7F, 0, 0);
        animator.rotate(mouthTop1, 0.1F, -0.05F, 0);
        animator.rotate(tongue1Base, 0, 0.3F, 0);
        animator.rotate(tongue2, -0.1F, 0.4F, 0);
        animator.rotate(tongue3, -0.5F, 0F, 0);
        animator.rotate(leaf1Head, 0.7F, 0, 0);
        animator.rotate(leaf2Head, 0.7F, 0, 0);
        animator.rotate(leaf3Head, 0.7F, 0, 0);
        animator.rotate(leaf4Head, 0.7F, 0, 0);
        animator.rotate(leaf5Head, 0.7F, 0, 0);
        animator.rotate(leaf6Head, 0.7F, 0, 0);
        animator.rotate(leaf7Head, 0.7F, 0, 0);
        animator.rotate(leaf8Head, 0.7F, 0, 0);
        animator.endPhase();
        animator.startPhase(2);
        animator.rotate(stem1Base, -0.1F, 0, 0);
        animator.rotate(stem2, -0.5F, 0, 0);
        animator.rotate(stem3, 0.9F, 0, 0);
        animator.rotate(stem4, 0.6F, 0, 0);
        animator.rotate(headBase, 0.6F, 0, 0);
        animator.rotate(stem1Joint, 0, -0.4F, 0);
        animator.rotate(stem1Base, -0.6F, 0, 0);
        animator.rotate(stem2, -0.7F, 0, 0);
        animator.rotate(stem3, -0.6F, 0, 0);
        animator.rotate(stem4, -0.6F, 0, 0);
        animator.rotate(headBase, 1.25F, 0, 0);
        animator.rotate(mouthTop1, 0.1F, -0.05F, 0);
        animator.rotate(tongue1Base, 0, 0.3F, 0);
        animator.rotate(tongue2, -0.1F, 0.4F, 0);
        animator.rotate(tongue3, -0.5F, 0F, 0);
        animator.rotate(leaf1Head, 0.7F, 0, 0);
        animator.rotate(leaf2Head, 0.7F, 0, 0);
        animator.rotate(leaf3Head, 0.7F, 0, 0);
        animator.rotate(leaf4Head, 0.7F, 0, 0);
        animator.rotate(leaf5Head, 0.7F, 0, 0);
        animator.rotate(leaf6Head, 0.7F, 0, 0);
        animator.rotate(leaf7Head, 0.7F, 0, 0);
        animator.rotate(leaf8Head, 0.7F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(27);
    }
}
