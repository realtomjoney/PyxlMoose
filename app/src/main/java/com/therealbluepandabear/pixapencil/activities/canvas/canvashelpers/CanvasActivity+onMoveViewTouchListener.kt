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

package com.therealbluepandabear.pixapencil.activities.canvas.canvashelpers

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity

@SuppressLint("ClickableViewAccessibility")
fun CanvasActivity.onMoveViewTouchListener(): View.OnTouchListener {
    return View.OnTouchListener { _, event ->
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (originalX == null && originalY == null) {
                    originalX = binding.activityCanvasCardView.x
                    originalY = binding.activityCanvasCardView.y
                }

                dX = binding.activityCanvasCardView.x - event.rawX
                dY = binding.activityCanvasCardView.y - event.rawY
            }

            MotionEvent.ACTION_MOVE -> {
                binding.activityCanvasCardView.y = event.rawY + dY
                binding.activityCanvasCardView.x = event.rawX + dX
            }
        }

        binding.root.invalidate()
        true
    }
}