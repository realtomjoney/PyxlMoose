/*
 * PixaPencil
 * Copyright 2022  therealbluepandabear
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.therealbluepandabear.pixapencil.activities.main.bottomsheet

import com.therealbluepandabear.pixapencil.activities.main.BottomSheetDialog
import com.therealbluepandabear.pixapencil.activities.main.MainActivity
import com.therealbluepandabear.pixapencil.models.PixelArt

fun MainActivity.extendedOnDuplicateTapped(pixelArt: PixelArt, bottomSheetDialog: BottomSheetDialog) {
    val duplicatedPixelArt = PixelArt(
        pixelArt.coverBitmapFilePath,
        pixelArt.bitmap,
        pixelArt.width,
        pixelArt.height,
        pixelArt.title,
        pixelArt.starred
    )

    pixelArtViewModel.insert(duplicatedPixelArt)

    bottomSheetDialog.dismiss()
}