package com.therealbluepandabear.pixapencil

import com.therealbluepandabear.pixapencil.models.PixelArt
import com.therealbluepandabear.pixapencil.utility.InternalBitmapFileNameGenerator
import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PixelArtModelTests {
    @Test
    fun createPixelArtObj_assertTitle() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.title } returns "Project"

        assert(pixelArtObj.title == "Project")
    }

    @Test
    fun createPixelArtObj_assertStarredTrue() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.starred } returns true

        assert(pixelArtObj.starred)
    }

    @Test
    fun createPixelArtObj_assertStarredFalse() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.starred } returns false

        assert(!pixelArtObj.starred)
    }

    @Test
    fun createPixelArtObj_assertCoverBitmapFilePath() {
        val title = "Project"
        val coverBitmapFilePath = InternalBitmapFileNameGenerator.generate(title)

        val pixelArtObj = mockk<PixelArt>(relaxed = true).also {
            every { it.title } returns title
            every { it.coverBitmapFilePath } returns coverBitmapFilePath
        }

        assert(pixelArtObj.coverBitmapFilePath == coverBitmapFilePath)
    }

    @Test
    fun createPixelArtObj_assertRotation() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.rotation } returns 90f

        assert(pixelArtObj.rotation == 90f)
    }

    @Test
    fun createPixelArtObj_assertObjId() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.objId } returns 55

        assert(pixelArtObj.objId == 55)
    }

    @Test
    fun createPixelArtObj_assertWidth() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.width } returns 10

        assert(pixelArtObj.width == 10)
    }

    @Test
    fun createPixelArtObj_assertHeight() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.height } returns 25

        assert(pixelArtObj.height == 25)
    }

    @Test
    fun createPixelArtObj_assertDimenCW() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.dimenCW } returns 15

        assert(pixelArtObj.dimenCW == 15)
    }

    @Test
    fun createPixelArtObj_assertDimenCH() {
        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.dimenCH } returns 65

        assert(pixelArtObj.dimenCH == 65)
    }

    @Test
    fun createPixelArtObj_assertDateCreated() {
        val dateCreated = DateTimeCompat.getCompatibleCurrentDateTime()

        val pixelArtObj = mockk<PixelArt>(relaxed = true)
        every { pixelArtObj.dateCreated } returns dateCreated

        assert(pixelArtObj.dateCreated == dateCreated)
    }
}