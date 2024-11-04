package com.example.bottomnavbar_travelapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class TicketFragmentDirections private constructor() {
  public companion object {
    public fun actionTicketFragmentToOrderTicketFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_ticketFragment_to_orderTicketFragment)
  }
}
