package me.nashiroaoi.exchangebot

enum class MoneyCodes(val country:String,val currency:String) {
    AED("アラブ首長国連邦","ディルハム"),
    AFN("アフガニスタン","アフガニ"),
    ALL("アルバニア","レク"),
    AMD("アルメニア","ドラム"),
    ANG("オランダ領アンティル","ギルデン"),
    AOA("アンゴラ","クワンザ"),
    ARS("アルゼンチン","ペソ"),
    AUD("オーストラリア","ドル"),
    AWG("アルバ","フロリン"),
    AZN("アゼルバイジャン","マナト"),
    BAM("ボスニアヘルツェゴビナ","コンバーチブルマーク"),
    BBD("バルバドス","ドル"),
    BTC("仮想通貨","ビットコイン"),
    BDT("バングラデシュ","タカ"),
    BGN("ブルガリア","レフ"),
    BHD("バーレーン","ディナール"),
    BIF("ブルンジ","フラン"),
    BMD("バミューダ","ドル"),
    BND("ブルネイ","ドル"),
    BOB("ボリビア","ボリビアーノ"),
    BRL("ブラジル","レアル"),
    BSD("バハマ","ドル"),
    BTN("ブータン","ニュルタム"),
    BWP("ボツワナ","プラ"),
    BYN("ベラルーシ","ルーブル"),
    BYR("ベラルーシ","ルーブル"),
    BZD("ベリーズ","ドル"),
    CAD("カナダ","ドル"),
    CDF("コンゴ","フラン"),
    CHF("スイス","フラン"),
    CLF("チリ","ウニダ・デ・フォメント"),
    CLP("チリ","ペソ"),
    CNH("中国","人民元オフショア"),
    CNY("中国","人民元"),
    COP("コロンビア","ペソ"),
    CRC("コスタリカ","コロン"),
    CUC("キューバ","ペソコンバーチブル"),
    CVE("カーボベルデ","エスクード"),
    CZK("チェコ","コルナ"),
    DJF("ジブチ","フラン"),
    DKK("デンマーク","クローネ"),
    DOP("ドミニカ","ペソ"),
    DZD("アルジェリア","ディナール"),
    EGP("エジプト","ポンド"),
    ERN("エリトリア","ナクファ"),
    ETB("エチオピア","ブル"),
    EUR("EU","ユーロ"),
    FJD("フィジー","ドル"),
    FKP("フォークランド","ポンド"),
    GBP("英国","ポンド"),
    GBX("ブリティッシュ","ペニー"),
    GEL("ジョージアン","ラリ"),
    GGP("ガーンジー","ポンド"),
    GHS("ガーナ","セディ"),
    GIP("ジブラルタル","ポンド"),
    GMD("ガンビア","ダラシ"),
    GNF("ギニア","フラン"),
    GTQ("グアテマラ","ケツァル"),
    GYD("ガイアナ","ドル"),
    HKD("香港","ドル"),
    HNL("ホンジュラス","レンピラ"),
    HRK("クロアチア","クーナ"),
    HTG("ハイチ","グールド"),
    HUF("ハンガリー","フォリント"),
    IDR("インドネシア","ルピア"),
    ILS("イスラエル","新シェケル"),
    IMP("マン島","ポンド"),
    INR("インド","ルピー"),
    IQD("イラク","ディナール"),
    ISK("アイスランド","クローナ"),
    JEP("ジャージー","ポンド"),
    JMD("ジャマイカ","ドル"),
    JOD("ヨルダン","ディナール"),
    JPY("日本","円"),
    KES("ケニア","シリング"),
    KGS("キルギス","ソム"),
    KHR("カンボジア","リエル"),
    KMF("コモロ","フラン"),
    KRW("韓国","ウォン"),
    KWD("クウェート","ディナール"),
    KYD("ケイマン諸島","ドル"),
    KZT("カザフスタン","テンゲ"),
    LAK("ラオ","キップ"),
    LBP("レバノン","ポンド"),
    LKR("スリランカ","ルピー"),
    LRD("リベリア","ドル"),
    LSL("レソト","ロチ"),
    LYD("リビア","ディナール"),
    MAD("モロッコ","ディルハム"),
    MDL("モルドバ","レウ"),
    MGA("マダガスカル","アリアリ"),
    MKD("マケドニア","デナール"),
    MMK("ミャンマー","チャット"),
    MNT("モンゴル","トゥグルグ"),
    MOP("マカオ","パタカ"),
    MRO("モーリタニア","ウギア"),
    MTL("マルタ","リラ"),
    MUR("モーリシャス","ルピー"),
    MVR("モルディブ","ルフィア"),
    MWK("マラウイ","クワチャ"),
    MXN("メキシコ","ペソ"),
    MYR("マレーシア","リンギット"),
    MZN("モザンビーク","メティカル"),
    NAD("ナミビア","ドル"),
    NGN("ナイジェリア","ナイラ"),
    NIO("ニカラグア","コルドバ"),
    NOK("ノルウェー","クローネ"),
    NPR("ネパール","ルピー"),
    NZD("ニュージーランド","ドル"),
    OMR("オマーン","リアル"),
    PAB("パナマ","バルボア"),
    PEN("ペルー","ソル"),
    PGK("パプアニューギニア","キナ"),
    PHP("フィリピン","ペソ"),
    PKR("パキスタン","ルピー"),
    PLN("ポーランド","ズウォティ"),
    PYG("パラグアイ","グアラニー"),
    QAR("カタール","リヤル"),
    RON("ルーマニア","レウ"),
    RSD("セルビア","ディナール"),
    RUB("ロシア","ルーブル"),
    RWF("ルワンダ","フラン"),
    SAR("サウジアラビア","リヤル"),
    SBD("ソロモン諸島","ドル"),
    SCR("セイシェル","ルピー"),
    SEK("スウェーデン","クローナ"),
    SGD("シンガポール","ドル"),
    SHP("セントヘレニアン","ポンド"),
    SLL("シエラレオネ","レオン"),
    SOS("ソマリア","シリング"),
    SRD("スリナム","ドル"),
    SSP("南スーダン","ポンド"),
    STD("サントメ-プリンシペ","ドブラ"),
    SVC("サルバドール","コロン"),
    SZL("スワジ","リランゲニ"),
    THB("タイ","バーツ"),
    TJS("タジキスタン","ソモニ"),
    TMM("トルクメニスタン","マナト"),
    TMT("トルクメニスタン","マナト"),
    TND("チュニジア","ディナール"),
    TOP("トンガ","パアンガ"),
    TRY("トルコ","リラ"),
    TTD("トリニダードトバゴ","ドル"),
    TWD("台湾","ニュー台湾ドル"),
    TZS("タンザニア","シリング"),
    UAH("ウクライナ","グリブナ"),
    UGX("ウガンダ","シリング"),
    USD("アメリカ","ドル"),
    UYU("ウルグアイ","ペソ"),
    UZS("ウズベキスタン","ソム"),
    VES("ベネズエラ","ボリバルソベラノ"),
    VND("ベトナム","ドン"),
    VUV("バヌアツ","バツ"),
    WST("サモア","タラ"),
    XAF("中央アフリカ","CFAフラン"),
    XAG("貴金属","銀"),
    XAU("貴金属","金"),
    XCD("東カリブ","ドル"),
    XDR("国際通貨基金","特別引出権"),
    XOF("西アフリカ","CFAフラン"),
    XPD("貴金属","パラジウム"),
    XPF("フランス領太平洋地域","CFPフラン"),
    XPT("貴金属","プラチナ"),
    YER("イエメン","リアル"),
    ZAR("南アフリカ","ランド"),
    ZMW("ザンビア","クワチャ"),
    ZWL("ジンバブエ","ドル");
    
    companion object{
        fun findByCurrency(key:String) : ArrayList<MoneyCodes> {
            val result = ArrayList<MoneyCodes>()
            values().forEach { c->
                if(c.currency.contains(key)){
                    result.add(c)
                }
            }
            return result
        }
    }
}
