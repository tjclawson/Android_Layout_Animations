package com.example.galleryapp

class ImageRepo {
    companion object {
        val imageList = mutableListOf<ImageItem>()
        fun createImageList(): MutableList<ImageItem> {
            for(i in 0 until IMAGE_IDS.size) {
                imageList.add(ImageItem(IMAGE_IDS[i], IMAGE_NAMES[i]))
            }

            return imageList
        }
    }
}