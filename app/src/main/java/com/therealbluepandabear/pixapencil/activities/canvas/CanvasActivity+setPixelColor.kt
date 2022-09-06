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

package com.therealbluepandabear.pixapencil.activities.canvas

fun CanvasActivity.setPixelColor(color: Int) {
    if (binding.activityCanvasColorSwitcherView.getIsPrimarySelected()) {
        viewModel.primaryColor = color
        viewModel.isPrimaryColorSelected = true
        binding.activityCanvasColorSwitcherView.setPrimaryColor(viewModel.primaryColor)
    } else {
        viewModel.secondaryColor = color
        viewModel.isPrimaryColorSelected = false
        binding.activityCanvasColorSwitcherView.setSecondaryColor(viewModel.secondaryColor)
    }
}
