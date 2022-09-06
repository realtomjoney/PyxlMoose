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

package com.therealbluepandabear.pixapencil.activities.main

import android.content.Intent
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.utility.constants.StringConstants

fun MainActivity.extendedOnDoneButtonPressed(projectTitle: String, width: Int, height: Int, spotLightInProgress: Boolean) {
    startActivity(
        Intent(this, CanvasActivity::class.java)
            .putExtra(StringConstants.Extras.PROJECT_TITLE_EXTRA, projectTitle)
            .putExtra(StringConstants.Extras.WIDTH_EXTRA, width)
            .putExtra(StringConstants.Extras.HEIGHT_EXTRA, height)
            .putExtra(StringConstants.Extras.SPOTLIGHT_IN_PROGRESS_EXTRA, spotLightInProgress)
    )
}