package me.nashiroaoi.exchangebot

import com.jagrosh.jdautilities.command.CommandClientBuilder
import me.nashiroaoi.exchangebot.command.Exchange
import me.nashiroaoi.exchangebot.command.SearchCurrency
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent

class BotClient{
    private lateinit var jda: JDA
    fun main(token: String) {
        val commandClient = CommandClientBuilder()
            .setPrefix("")
            .addCommand(Exchange())
            .addCommand(SearchCurrency())
            .setOwnerId("")
            .build()
        
        jda = JDABuilder.createLight(token,
            GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(commandClient)
            .build()
    }
    
}

fun main(){
    val bot = BotClient()
    bot.main("TOKEN")
}