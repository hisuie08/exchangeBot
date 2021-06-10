package me.nashiroaoi.exchangebot

import com.jagrosh.jdautilities.command.CommandEvent
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.interactions.components.Button
import java.awt.Color

fun argumentErrorBuilder(event : CommandEvent){
    val embed = EmbedBuilder().also {
        it.setColor(Color.red)
        it.setTitle(":warning: エラー")
        it.setDescription("引数が不正です\n```exchange [base] [target] [amount(任意)]```\nの形で入力してください")
    }.build()
    event.reply(embed)
}

fun exchangeBuilder(event:CommandEvent, base:String, target:String, amount:Int=1){
    val baseCode = base.uppercase()
    val targetCode = target.uppercase()
    val res = get(baseCode)
    val embed = EmbedBuilder().also {
        it.setFooter("worked by coinbase.com")
    }
    
    if(res != null){
        embed.setTitle("為替レート")
        embed.setColor(0x00ff00)
        embed.addField(
            "$amount ${MoneyCodes.valueOf(baseCode).currency}"
            ,MoneyCodes.valueOf(baseCode).country,false)
        if(res.data?.rates?.get(targetCode) != null){
            res.data.rates[targetCode]!!.toFloat().let {
                embed.addField(
                    "${it*amount.toFloat()} ${MoneyCodes.valueOf(targetCode).currency}"
                    ,MoneyCodes.valueOf(targetCode).country,false)
            }
        }else{
            embed.clear()
            embed.setTitle(":warning: エラー")
            embed.setColor(Color.red)
            embed.setDescription("通貨コード $targetCode が見つかりませんでした。")
            
        }
    }else{
        embed.setTitle(":warning: エラー")
        embed.setColor(Color.red)
        embed.setDescription("通貨コード $baseCode が見つかりませんでした。")
    }
    event.reply(embed.build())
}
