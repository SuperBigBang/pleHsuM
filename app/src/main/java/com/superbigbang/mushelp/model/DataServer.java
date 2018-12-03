package com.superbigbang.mushelp.model;

import java.util.ArrayList;
import java.util.List;

public class DataServer {

    private static final String HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK = "https://avatars1.githubusercontent.com/u/7698209?v=3&s=460";
    private static final String CYM_CHAD = "CymChad";
    private static final String SET_LIST_NAME = "Сет лист ";

    private DataServer() {
    }

    /*
        public static List<Status> getSampleData(int lenth) {
            List<Status> list = new ArrayList<>();
            for (int i = 0; i < lenth; i++) {
                Status status = new Status();
                status.setUserName("Chad" + i);
                status.setCreatedAt("04/05/" + i);
                status.setRetweet(i % 2 == 0);
                status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
                status.setText("BaseRecyclerViewAdpaterHelper https://www.recyclerview.org");
                list.add(status);
            }
            return list;
        }

        public static List<Status> addData(List list, int dataSize) {
            for (int i = 0; i < dataSize; i++) {
                Status status = new Status();
                status.setUserName("Chad" + i);
                status.setCreatedAt("04/05/" + i);
                status.setRetweet(i % 2 == 0);
                status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
                status.setText("Powerful and flexible RecyclerAdapter https://github.com/CymChad/BaseRecyclerViewAdapterHelper");
                list.add(status);
            }

            return list;
        }

        public static List<MySection> getSampleData() {
            List<MySection> list = new ArrayList<>();
            list.add(new MySection(true, "Section 1", true));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(true, "Section 2", false));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(true, "Section 3", false));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(true, "Section 4", false));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(true, "Section 5", false));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
            return list;
        }

        public static List<SectionMultipleItem> getSectionMultiData() {
            List<SectionMultipleItem> list = new ArrayList<>();
            Video video = new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD);

            // add section data
            list.add(new SectionMultipleItem(true, "Section 1", true));
            // add multiple type item data ---start---
            list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_0")));
            list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_1")));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_2")));
            // ---end---

            list.add(new SectionMultipleItem(true, "Section 2", false));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
            list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
            list.add(new SectionMultipleItem(true, "Section 3", false));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            list.add(new SectionMultipleItem(true, "Section 4", false));
            list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
            list.add(new SectionMultipleItem(true, "Section 5", false));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
            return list;
        }

        public static List<String> getStrData() {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                String str = HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK;
                if (i % 2 == 0) {
                    str = CYM_CHAD;
                }
                list.add(str);
            }
            return list;
        }

        public static List<MultipleItem> getMultipleItemData() {
            List<MultipleItem> list = new ArrayList<>();
            for (int i = 0; i <= 4; i++) {
                list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
                list.add(new MultipleItem(MultipleItem.TEXT, MultipleItem.TEXT_SPAN_SIZE, CYM_CHAD));
                list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE));
                list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE_MIN));
                list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE_MIN));
            }

            return list;
        }
    */
    public static List<NormalMultipleEntity> getSetListsMultipleEntities() {
        List<NormalMultipleEntity> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new NormalMultipleEntity(NormalMultipleEntity.SET_LISTS, SET_LIST_NAME + (i + 1)));
        }
        return list;
    }

    public static List<NormalMultipleEntity> getSongsMultipleEntities() {
        List<NormalMultipleEntity> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new NormalMultipleEntity(NormalMultipleEntity.SONGS_LISTS, "Song name", "Song lyrics"));
            if (i == 1) {
                list.add(new NormalMultipleEntity(NormalMultipleEntity.SONGS_LISTS, "Three Days Grace - Over and Over", "I feel it everyday, it's all the same\n" +
                        "It brings me down, but I'm the one to blame\n" +
                        "I've tried everything to get away\n" +
                        "So here I go again\n" +
                        "Chasing you down again\n" +
                        "Why do I do this?\n" +
                        "Over and over, over and over\n" +
                        "I fall for you\n" +
                        "Over and over, over and over\n" +
                        "I try not to\n" +
                        "It feels like everyday stays the same\n" +
                        "It's dragging me down, and I can't pull away\n" +
                        "So here I go again\n" +
                        "Chasing you down again\n" +
                        "Why do I do this?\n" +
                        "Over and over, over and over\n" +
                        "I fall for you\n" +
                        "Over and over, over and over\n" +
                        "I try not to\n" +
                        "Over and over, over and over\n" +
                        "You make me fall for you\n" +
                        "Over and over, over and over\n" +
                        "You don't even try\n" +
                        "So many thoughts that I can't get out of my head\n" +
                        "I try to live without you\n" +
                        "Every time I do, I feel dead\n" +
                        "I know what's best for me\n" +
                        "But I want you instead\n" +
                        "I'll keep on wasting all my time\n" +
                        "Over and over, over and over\n" +
                        "I fall for you\n" +
                        "Over and over, over and over\n" +
                        "I try not to\n" +
                        "Over and over, over and over\n" +
                        "You make me fall for you\n" +
                        "Over and over, over and over\n" +
                        "You don't even try to\n" +
                        "Авторы: Gavin Brown / Neil Sanderson / Adam Gontier / Brad Walst / Barry Stock\n" +
                        "Текст песни \"Over and Over\", © Sony/ATV Music Publishing LLC, Kobalt Music Publishing Ltd."));
            }
        }
        return list;
    }
//    public static List<MultipleItem> getMultipleChildView() {
//        List<MultipleItem> list = new ArrayList<>();
//        for (int i = 0; i <= 4; i++) {
//            list.add(new ClickEntity(ClickEntity.CLICK_ITEM_VIEW, MultipleItem.TEXT_SPAN_SIZE, CYM_CHAD));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.BIG_IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//        }
//
//        return list;
//    }


}