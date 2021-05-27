package com.example.project5_mikhsangumanof;

class ListDataMenu {
    private String listMenu;
    private int imageMenu;

    ListDataMenu(String listMenu, int imageMenu){
        this.setListMenu(listMenu);
        this.setImageMenu(imageMenu);
    }

    String getListMenu() {
        return listMenu;
    }

    private void setListMenu(String listMenu) {
        this.listMenu = listMenu;
    }

    int getImageMenu() {
        return imageMenu;
    }

    private void setImageMenu(int imageMenu) {
        this.imageMenu = imageMenu;
    }
}
