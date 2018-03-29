package appman.intern.bosstanayot.internappman.modelTest

import appman.intern.bosstanayot.internappman.dataList.model.JsonDatas
import com.beust.klaxon.Klaxon
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DataListModelTest {
    private lateinit var json: String
    private lateinit var result: JsonDatas
    @Before
    @Throws(Exception::class)
    fun setUp() {
        json = TestHelper().getStringFromFile("intern.json")
        result = Klaxon().parse<JsonDatas>(json)!!
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_getId() {
        Assert.assertEquals("Id", result.id, "045687")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_getFirstName() {
        Assert.assertEquals("FirstName", result.firstName, "Patamon")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_getLastName() {
        Assert.assertEquals("LastName", result.lastName, "luksame")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data0_docType() {
        Assert.assertEquals("DocType", result.data[0].docType, "A1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data1_docType() {
        Assert.assertEquals("DocType", result.data[1].docType, "A2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data2_docType() {
        Assert.assertEquals("DocType", result.data[2].docType, "A3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data3_docType() {
        Assert.assertEquals("DocType", result.data[3].docType, "A4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data4_docType() {
        Assert.assertEquals("DocType", result.data[4].docType, "B1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data5_docType() {
        Assert.assertEquals("DocType", result.data[5].docType, "B2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data6_docType() {
        Assert.assertEquals("DocType", result.data[6].docType, "C1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data7_docType() {
        Assert.assertEquals("DocType", result.data[7].docType, "C2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data8_docType() {
        Assert.assertEquals("DocType", result.data[8].docType, "C3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data9_docType() {
        Assert.assertEquals("DocType", result.data[9].docType, "C4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data10_docType() {
        Assert.assertEquals("DocType", result.data[10].docType, "D1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data11_docType() {
        Assert.assertEquals("DocType", result.data[11].docType, "D2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data12_docType() {
        Assert.assertEquals("DocType", result.data[12].docType, "D3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data13_docType() {
        Assert.assertEquals("DocType", result.data[13].docType, "D4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data14_docType() {
        Assert.assertEquals("DocType", result.data[14].docType, "D5")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data0_description_th() {
        Assert.assertEquals("Description_th", result.data[0].description.th, "เอกสารที่ใช้แสดงตน A1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data0_description_en() {
        Assert.assertEquals("Description_en", result.data[0].description.en, "Document TYPE A1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data1_description_th() {
        Assert.assertEquals("Description_th", result.data[1].description.th, "เอกสารที่ใช้แสดงตน A2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data1_description_en() {
        Assert.assertEquals("Description_en", result.data[1].description.en, "Document TYPE A2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data2_description_th() {
        Assert.assertEquals("Description_th", result.data[2].description.th, "เอกสารที่ใช้แสดงตน A3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data2_description_en() {
        Assert.assertEquals("Description_en", result.data[2].description.en, "Document TYPE A3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data3_description_th() {
        Assert.assertEquals("Description_th", result.data[3].description.th, "เอกสารที่ใช้แสดงตน A4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data3_description_en() {
        Assert.assertEquals("Description_en", result.data[3].description.en, "Document TYPE A4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data4_description_th() {
        Assert.assertEquals("Description_th", result.data[4].description.th, "หน้าสมุดบัญชีธนาคารรับชำระเงินปันผล B1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data4_description_en() {
        Assert.assertEquals("Description_en", result.data[4].description.en, "BookBank B1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data5_description_th() {
        Assert.assertEquals("Description_th", result.data[5].description.th, "หน้าสมุดบัญชีธนาคารรับชำระเงินปันผล B2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data5_description_en() {
        Assert.assertEquals("Description_en", result.data[5].description.en, "BookBank B2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data6_description_th() {
        Assert.assertEquals("Description_th", result.data[6].description.th, "ข้อมูลของผู้ขอเอาประกันภัย C1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data6_description_en() {
        Assert.assertEquals("Description_en", result.data[6].description.en, "Information TYPE C1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data7_description_th() {
        Assert.assertEquals("Description_th", result.data[7].description.th, "ข้อมูลของผู้ขอเอาประกันภัย C2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data7_description_en() {
        Assert.assertEquals("Description_en", result.data[7].description.en, "Information TYPE C2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data8_description_th() {
        Assert.assertEquals("Description_th", result.data[8].description.th, "ข้อมูลของผู้ขอเอาประกันภัย C3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data8_description_en() {
        Assert.assertEquals("Description_en", result.data[8].description.en, "Information TYPE C3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data9_description_th() {
        Assert.assertEquals("Description_th", result.data[9].description.th, "ข้อมูลของผู้ขอเอาประกันภัย C4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data9_description_en() {
        Assert.assertEquals("Description_en", result.data[9].description.en, "Information TYPE C4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data10_description_th() {
        Assert.assertEquals("Description_th", result.data[10].description.th, "อื่นๆ D1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data11_description_en() {
        Assert.assertEquals("Description_en", result.data[10].description.en, "Other D1")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data11_description_th() {
        Assert.assertEquals("Description_th", result.data[11].description.th, "อื่นๆ D2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data12_description_en() {
        Assert.assertEquals("Description_en", result.data[11].description.en, "Other D2")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data12_description_th() {
        Assert.assertEquals("Description_th", result.data[12].description.th, "อื่นๆ D3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data13_description_en() {
        Assert.assertEquals("Description_en", result.data[12].description.en, "Other D3")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data13_description_th() {
        Assert.assertEquals("Description_th", result.data[13].description.th, "อื่นๆ D4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data14_description_en() {
        Assert.assertEquals("Description_en", result.data[13].description.en, "Other D4")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data14_description_th() {
        Assert.assertEquals("Description_th", result.data[14].description.th, "อื่นๆ D5")
    }

    @Test
    @Throws(Exception::class)
    fun parseJson_Data10_description_en() {
        Assert.assertEquals("Description_en", result.data[14].description.en, "Other D5")
    }
}